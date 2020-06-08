package com.ygjy.systemmanagement.service.impl;
import com.ygjy.systemmanagement.dao.UserMapper;
import com.ygjy.systemmanagement.pojo.User;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
     * 通过前端页面输入的用户名进行匹配用户信息
     * @param userName
     * @return
     */
    @Override
    public User queryPasswordByUserName(String userName) {
        return userMapper.queryPasswordByUserName(userName);
    }
}
