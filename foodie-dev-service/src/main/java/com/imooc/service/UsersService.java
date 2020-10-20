package com.imooc.service;

import com.imooc.pojo.Stu;

/**
 * @Author 郭志武
 * @Date 2020/10/13 23:04
 * @Version 1.0
 */
public interface UsersService {

    /**
     * 校验用户名是否存在
     * @param username
     * @return
     */
    public boolean queryUsernameIsExists(String username);


}
