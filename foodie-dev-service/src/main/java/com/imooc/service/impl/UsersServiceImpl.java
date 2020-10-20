package com.imooc.service.impl;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

/**
 * @Author 郭志武
 * @Date 2020/10/18 20:12
 * @Version 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExists(String username) {

        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();
        //比较一下两个值是否相等
        userCriteria.andEqualTo("username",username);

        Users result = usersMapper.selectOneByExample(userExample);
        return result == null ? false:true;
    }
}
