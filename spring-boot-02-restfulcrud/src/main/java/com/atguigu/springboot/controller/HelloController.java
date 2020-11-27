package com.atguigu.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {

        return "Hello World";
    }

    @RequestMapping("/success")
    public String success(HashMap<String, String> map) {
        map.put("hello","你好");
        return "success";
    }

    //不会返回你好
    @RequestMapping("/success1")
    public String success1() {
        HashMap<String, String> map = new HashMap();
        map.put("hello","你好");
        return "success";
    }


//    @RequestMapping({"/","/index.html"})
//    public String index() {
//        return "index";
//    }
}
