package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加用户角色
     * @param record
     * @return
     */
    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}