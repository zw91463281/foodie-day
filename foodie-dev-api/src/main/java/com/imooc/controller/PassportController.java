package com.imooc.controller;

import com.imooc.service.StuService;
import com.imooc.service.UsersService;
import com.imooc.utils.IMOOCJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 郭志武
 * @Date 2020/10/18 20:20
 * @Version 1.0
 */
@RestController
@RequestMapping("/passport")
public class PassportController {

    @Autowired
    private UsersService usersService;

    /**
     * 校验该用户名是否存在
     * @param username
     * @return
     */
    @GetMapping("/usernameIsExists")
    public IMOOCJSONResult usernameIsExists(String username){
        //首先判断传入的用户名是否正确
        if (StringUtils.isBlank(username)){
            return IMOOCJSONResult.errorMsg("用户名不能为空");
        }
        //判断用户名是否存在
        boolean isExists = usersService.queryUsernameIsExists(username);
        if (isExists){
            return IMOOCJSONResult.errorMsg("用户名已经存在");//此时该用户名已经存在
        }
        // 此时请求成功，用户名无重复
        return IMOOCJSONResult.ok();
    }



}
