package com.ygjy.systemmanagement.service.impl;
import com.ygjy.systemmanagement.dao.UserMapper;
import com.ygjy.systemmanagement.pojo.User;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户信息
     * @param userId
     * @param userAccount
     * @param contactAddress
     * @return
     */
    @Override
    public List<User> findUserAll(Integer userId, String userAccount, String contactAddress) {
        return userMapper.selectUserAll(userId,userAccount,userAccount);
    }

    /**
     * 通过用户名获取密码进行判断登录信息
     * @param username
     * @return
     */
    @Override
    public User loginByUsername(String username) {
        return userMapper.loginByUsername(username);
    }
}
