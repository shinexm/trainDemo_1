package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuming on 2019/12/26.
 */
@Controller
public class HelloWordController {

    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
}
