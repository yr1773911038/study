package com.example.demo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigChangeListener;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.example.springbootstarterexception.constant.Status;
import com.example.springbootstarterexception.exception.PageException;
import com.example.springbootstarterexception.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

    @GetMapping("/json")
    public ApiResponse hh(){
        //传统的方式
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "test1";
        String someDefaultValue = "someDefaultValueForTheKey";
        String value = config.getProperty(someKey, someDefaultValue);

        config.addChangeListener(new ConfigChangeListener() {
            @Override
            public void onChange(ConfigChangeEvent changeEvent) {
                System.out.println("Changes for namespace " + changeEvent.getNamespace());
                for (String key : changeEvent.changedKeys()) {
                    ConfigChange change = changeEvent.getChange(key);
                    System.out.println(String.format("Found change - key: %s, oldValue: %s, newValue: %s, changeType: %s", change.getPropertyName(), change.getOldValue(), change.getNewValue(), change.getChangeType()));
                }
            }
        });

        return ApiResponse.ofSuccess(value);
       // throw  new JsonException(Status.FAIL);
    }

    @GetMapping("/page")
    public ModelAndView pageException() {
        throw new PageException(Status.FAIL);
    }

}
