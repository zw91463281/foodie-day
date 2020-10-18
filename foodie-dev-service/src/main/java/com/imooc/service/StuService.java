package com.imooc.service;

import com.imooc.pojo.Stu;

/**
 * @Author 郭志武
 * @Date 2020/10/13 23:04
 * @Version 1.0
 */
public interface StuService {

    public Stu getStus(int id);

    public void saveStus();

    public void updateStus(int id);

    public void deleteStus(int id);

}
