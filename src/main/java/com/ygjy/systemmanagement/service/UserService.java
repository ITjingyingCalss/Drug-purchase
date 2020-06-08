package com.ygjy.systemmanagement.service;

import com.ygjy.systemmanagement.pojo.User;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
 */
public interface UserService {

    /**
     * 登录,通过用户匹配对应信息
     * @param userName
     * @return
     */
    User queryPasswordByUserName(String userName);
}
