package com.imooc.service.impl;

import com.imooc.mapper.StuMapper;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 郭志武
 * @Date 2020/10/13 23:07
 * @Version 1.0
 */
@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    /**
     * 加入事务
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStus(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveStus() {
        Stu stu = new Stu();
        stu.setName("add");
        stu.setAge(19);
        stuMapper.insert(stu);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateStus(int id) {
        Stu stu = new Stu();
        stu.setId(id);
        stu.setName("update");
        stu.setAge(20);
        stuMapper.updateByPrimaryKey(stu);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteStus(int id) {
        stuMapper.deleteByPrimaryKey(id);
    }
}
