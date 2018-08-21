package com.example.demo01.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 文件上传
 */
@Controller
@EnableAutoConfiguration
public class FileController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }

}
