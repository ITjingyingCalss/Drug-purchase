package com.ygjy.systemmanagement.service;

import com.ygjy.systemmanagement.pojo.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
 */
public interface UserService {

    /**
     * 通过用户Id,用户名称,用户地址查找用户信息
     * @param userId
     * @param userAccount
     * @param contactAddress
     * @return
     */
    List<User> findUserAll(Integer userId,String userAccount,String contactAddress,Integer userState);

    /**
     * 通过用户账号获得用户密码进行判断登录
     * @param username
     * @return
     */
    User loginByUsername(String username);

    /**
     * 更新用户信息,假删除
     * @param user
     * @return
     */
    boolean updateUserStatus(User user);

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    boolean addUserInfo(User user);

    /**
     * 通过用户Id真删除
     * @param userId
     * @return
     */
    boolean removeUserInfo(Integer userId);

    /**
     * 通过id查询用户信息批量导出
     * @param userId
     * @return
     */
    List<User> queryUserList(String[] userId);

    /**
     * 查询所有省
     * @return
     */
    List<AddressProvince> findAll();

    /**
     * 通过省编码查询下属市
     * @param pcode
     * @return
     */
    List<AddressCity> findByPcode(String pcode);

    /**
     * 通过市编码查询下属县
     * @param ccode
     * @return
     */
    List<AddressTown> findTownByCcode(String ccode);

    /**
     * 验证用户信息合理性,是否重复添加
     * @param username
     * @param password
     * @param userPhone
     * @param userEmail
     * @return
     */
    User selectUserProperty(String username,String password,String userPhone,String userEmail);
}
