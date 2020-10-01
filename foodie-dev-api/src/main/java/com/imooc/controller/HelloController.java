package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 郭志武
 * @Date 2020/9/30 23:59
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public Object hello(){
        return "hello world";
    }
}
