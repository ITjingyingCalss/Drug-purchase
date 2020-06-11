package com.ygjy.systemmanagement.service.impl;
import com.ygjy.systemmanagement.dao.UserMapper;
import com.ygjy.systemmanagement.dao.UserRoleMapper;
import com.ygjy.systemmanagement.pojo.User;
import com.ygjy.systemmanagement.pojo.UserRole;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 查询所有用户信息
     * @param userId
     * @param userAccount
     * @param contactAddress
     * @return
     */
    @Override
    public List<User> findUserAll(Integer userId, String userAccount, String contactAddress,Integer userState) {
        return userMapper.selectUserAll(userId,userAccount,userAccount,userState);
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

    /**
     * 更新用户状态,实现假删除
     * @param user
     * @return
     */
    @Override
    public boolean updateUserStatus(User user) {
        user.setUserUpdateTime(new Date());
        int i = userMapper.updateByPrimaryKey(user);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @Override
    public boolean addUserInfo(User user) {
        UserRole userRole = new UserRole();
        userRole.setUserId(user.getUserId());
        userRole.setRoleId(user.getRole().getRoleId());
        userRoleMapper.insert(userRole);
        user.setUserCreateTime(new Date());
        user.setUserState(0);
        int i = userMapper.insertSelective(user);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据用户Id实现真删除
     * @param userId
     * @return
     */
    @Override
    public boolean removeUserInfo(Integer userId) {
        return userMapper.deleteUserByUserId(userId);
    }

    /**
     * 通过用户Id批量导出
     * @param userId
     * @return
     */
    @Override
    public List<User> queryUserList(String[] userId) {
        return userMapper.queryUserList(userId);
    }
}
