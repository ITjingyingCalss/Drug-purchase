package com.ygjy.systemmanagement.service;

import com.ygjy.systemmanagement.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
 */
public interface UserService {

/**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询/
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

    /***
     * 查询所有角色
     * @return
     */
    List<Role> findRoleAll();

    /**
     * 查询所有权限
     * @return
     */
    List<Jurisdiction> findJurisdictionAll();

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

    /**
     * 查询所有供货商
     * @param suppliersId
     * @param supplierName
     * @param supplierAddress
     * @return
     */
    List<Suppliers> findAllSuppliers(Integer suppliersId, String supplierName,String supplierAddress);

    /**
     * 验证供货商属性合理性,是否重复
     * @param supplierPhone
     * @param supplierEmail
     * @return
     */
    Suppliers findSuppliersProperty(String supplierPhone,String supplierEmail);

/**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新*/
    /**
     * 更新用户信息,假删除
     * @param user
     * @return
     */
    boolean updateUserStatus(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    boolean updateUserInfo(User user);

    /**
     * 修改供货商信息/假删除
     * @param suppliers
     * @return
     */
    boolean updateSuppliers(Suppliers suppliers);

    /**
     * 通过id更新角色信息
     * @param role
     * @return
     */
    boolean updateRoleInfo(Role role);

    /**
     * 通过id修改权限
     * @param jurisdiction
     * @return
     */
    boolean updateJurisdiction(Jurisdiction jurisdiction);

/**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加*/
    /**
     * 添加用户信息
     * @param user
     * @return
     */
    boolean addUserInfo(User user);

    /**
     * 添加供货商信息
     * @param suppliers
     * @return
     */
    boolean addSuppliers(Suppliers suppliers);

    /**
     * 添加角色信息
     * @param role
     * @return
     */
    boolean addRole(Role role);

    /**
     * 添加新权限
     * @param jurisdiction
     * @return
     */
    boolean addJurisdiction(Jurisdiction jurisdiction);

/**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除*/
    /**
     * 通过用户Id真删除
     * @param userId
     * @return
     */
    boolean removeUserInfo(Integer userId);

    /**
     * 删除供货商id
     * @param id
     * @return
     */
    boolean removeSuppliers(Integer id);

    /**
     * 通过id删除角色
     * @param id
     * @return
     */
    boolean reomoveRoleInfo(Integer id);

    /**
     * 通过id删除权限
     * @param id
     * @return
     */
    boolean removeJurisdiction(Integer id);

/**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**导出**/

    /**
     * 通过id查询用户信息批量导出
     * @param userId
     * @return
     */
    List<User> queryUserList(String[] userId);

    /**
     * 批量导出供货商信息
     * @param id
     * @return
     */
    List<Suppliers> querySuppliersList(String[] id);





}
