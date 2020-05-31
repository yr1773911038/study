package com.example.demo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
public class AppConfig {
    @ApolloConfig
    private Config config;

    @ApolloConfigChangeListener
    private void someOnChange(ConfigChangeEvent changeEvent) {
        Set<String> propertyNames = config.getPropertyNames();
        Set<String> strings = changeEvent.changedKeys();
    }
}