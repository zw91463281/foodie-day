package com.imooc.controller;

import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 郭志武
 * @Date 2020/10/13 22:59
 * @Version 1.0
 */
@RestController
public class StauController {

    @Autowired
    private StuService stuService;

    @GetMapping("/getStu")
    public Object getStu(int id){
        return stuService.getStus(id);
    }

    @PostMapping("/saveStu")
    public Object saveStu(){
        stuService.saveStus();
        return "ok";
    }

    @PostMapping("/updateStu")
    public Object updateStu(int id){
        stuService.updateStus(id);
        return "ok";
    }

    @PostMapping("/deleteStu")
    public Object deleteStu(int id){
        stuService.deleteStus(id);
        return "ok";
    }

}
