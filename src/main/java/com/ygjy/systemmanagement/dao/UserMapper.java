package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(User key);

    /**
     * 添加用户信息
     * @param record
     * @return
     */
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(User key);

    /**
     * 更新用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 通过用户Id,用户名称,用户地址查找用户信息
     * @param userId
     * @param userAccount
     * @param contactAddress
     * @return
     */
    List<User> selectUserAll(@Param("userId") Integer userId, @Param("userAccount") String userAccount, @Param("contactAddress") String contactAddress,@Param("userState") Integer userState);

    /**
     * 通过用户账号获得用户密码进行判断登录
     * @param username
     * @return
     */
    User loginByUsername(@Param("username") String username);

    /**
     * 通过用户id(userId)删除该条信息
     * @param userId
     * @return
     */
    boolean deleteUserByUserId(@Param("userId") Integer userId);

    /**
     * 通过用户id(userId)假删除该条信息
     * @param userId
     * @return
     */
    int updateUserStatus(@Param("userId") Integer userId);

    /**
     * 批量导出用户信息
     * @param userId
     * @return
     */
    List<User> queryUserList(String[] userId);

    /**
     * 验证表单属性合理性是否重复添加
     * @param username
     * @param password
     * @param userEmail
     * @param userPhone
     * @return
     */
    User selectUserProperty(@Param("username") String username,@Param("password") String password,@Param("userEmail") String userEmail,@Param("userPhone") String userPhone);
}