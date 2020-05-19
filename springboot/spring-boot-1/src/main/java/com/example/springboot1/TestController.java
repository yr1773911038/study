package com.example.springboot1;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Scanner;

@ResponseBody
@Controller
public class TestController {

    @PostMapping("/test")
    @ResponseBody
    public String hello(@RequestParam(required = false) String gg,  HttpServletRequest request) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String gg1 = request.getParameter("gg");

        String fullName = request.getParameter("fullName");
        /*String queryString = new String(request.getQueryString().getBytes(),"UTF-8");
        String decode = URLDecoder.decode(request.getQueryString(), "UTF-8");
        Enumeration<String> attributeNames = request.getAttributeNames();
        InputStream inputStream = request.getInputStream();

        String guid = request.getHeader("guid");
        String header = request.getHeader("Content-Type");*/

        return "hh"+fullName;
    }

    @PostMapping("/test11")
    @ResponseBody
    public String hello11(@RequestBody(required = false) String gg, HttpServletRequest request) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String gg1 = request.getParameter("gg");

        String fullName = request.getParameter("fullName");
        /*String queryString = new String(request.getQueryString().getBytes(),"UTF-8");
        String decode = URLDecoder.decode(request.getQueryString(), "UTF-8");
        Enumeration<String> attributeNames = request.getAttributeNames();
        InputStream inputStream = request.getInputStream();

        String guid = request.getHeader("guid");
        String header = request.getHeader("Content-Type");*/

        return "hh"+fullName;
    }
    @PostMapping("/test12")
    @ResponseBody
    public String hello12(@RequestParam(required = false) String gg, HttpServletRequest request) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String gg1 = request.getParameter("gg");

        String fullName = request.getParameter("fullName");
        /*String queryString = new String(request.getQueryString().getBytes(),"UTF-8");
        String decode = URLDecoder.decode(request.getQueryString(), "UTF-8");
        Enumeration<String> attributeNames = request.getAttributeNames();
        InputStream inputStream = request.getInputStream();

        String guid = request.getHeader("guid");
        String header = request.getHeader("Content-Type");*/

        return "hh"+fullName;
    }
    @PostMapping("/test2")
    @ResponseBody
    public String hello(HttpServletRequest request,HttpServletResponse response) throws IOException {
        InputStream inputStream = request.getInputStream();
        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";

        return "ok";
    }

    @PostMapping("/test3")
    @ResponseBody
    public String hello1(@RequestParam String name1, @RequestParam MultipartFile formFile,HttpServletRequest request) throws  Exception {
        System.out.println(name1);
        Scanner s = new Scanner(formFile.getInputStream()).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        Collection<Part> parts = request.getParts();
        return "hh";
    }


}
