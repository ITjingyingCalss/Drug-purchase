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

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(User key);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 通过用户Id,用户名称,用户地址查找用户信息
     * @param userId
     * @param userAccount
     * @param contactAddress
     * @return
     */
    List<User> selectUserAll(@RequestParam("userId") Integer userId, @RequestParam("userAccount") String userAccount, @RequestParam("contactAddress") String contactAddress);

    /**
     * 通过用户账号获得用户密码进行判断登录
     * @param username
     * @return
     */
    User loginByUsername(@Param("username") String username);
}