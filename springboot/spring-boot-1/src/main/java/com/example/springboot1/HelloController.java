package com.example.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/helloDemo")
    public String helloDemo(@RequestBody TestEntity entity){
        System.out.println(entity);
        return "hello";  //视图重定向hello.jsp
    }

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";  //视图重定向hello.jsp
    }

    @PostMapping("/helloP")
    @ResponseBody
    public String hello(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) throws IOException, ServletException {

        System.out.println("f:"+firstName+"l:"+lastName);
        return "f:"+firstName+"l:"+lastName;
        //return "hh"+firstName;
    }

    @PostMapping("/helloP3")
    @ResponseBody
    public String hello3(@RequestPart MultipartFile file,@RequestParam(required = false) String firstName,
                         @RequestParam(required = false) String lastName) throws IOException, ServletException {
        return "";
        //return "hh"+firstName;
    }
    @PostMapping("/helloP4")
    @ResponseBody
    public String hello4(HttpServletRequest request ) throws IOException, ServletException {
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        Enumeration<String> parameterNames = req.getParameterNames();
        List<MultipartFile> file = req.getFiles("file");


        return "";
        //return "hh"+firstName;
    }
    @PostMapping("/helloP2")
    @ResponseBody
    public String hello2( Person person) throws IOException, ServletException {

        System.out.println("f:"+person.getFirstName()+"l:"+person.getLastName());
        return "f:"+person.getFirstName()+"l:"+person.getLastName();
        //return "hh"+firstName;
    }

    @GetMapping("/helloP1")
    @ResponseBody
    public String hello1(HttpServletRequest request ) throws IOException, ServletException {
        String queryString = request.getQueryString();

        System.out.println(queryString);
        return queryString;
        //return "hh"+firstName;
    }
}
