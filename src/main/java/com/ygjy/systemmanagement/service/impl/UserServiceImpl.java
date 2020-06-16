package com.ygjy.systemmanagement.service.impl;
import com.ygjy.systemmanagement.dao.*;
import com.ygjy.systemmanagement.pojo.*;
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

    @Autowired
    private AddressProvinceMapper addressProvinceMapper;

    @Autowired
    private AddressCityMapper addressCityMapper;

    @Autowired
    private AddressTownMapper addressTownMapper;

    @Autowired
    private SuppliersMapper suppliersMapper;
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
     * 插损所有供货商
     * @param suppliersId
     * @param supplierName
     * @param supplierAddress
     * @return
     */
    @Override
    public List<Suppliers> findAllSuppliers(Integer suppliersId, String supplierName, String supplierAddress) {
        return suppliersMapper.selectAllSuppliers(suppliersId,supplierName,supplierAddress);
    }

    /**
     * 验证供货商信息合理性,是否有重复
     * @param supplierPhone
     * @param supplierEmail
     * @return
     */
    @Override
    public Suppliers findSuppliersProperty(String supplierPhone, String supplierEmail) {
        return null;
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
     * 修改用户信息
     * @param user
     * @return
     */
    @Override
    public boolean updateUserInfo(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 更新供货商信息,假删除
     * @param suppliers
     * @return
     */
    @Override
    public boolean updateSuppliers(Suppliers suppliers) {
        int i = suppliersMapper.updateByPrimaryKeySelective(suppliers);
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
       /* userRoleMapper.insert(userRole);*/
        user.setUserCreateTime(new Date());
        user.setUserState(0);
        int i = userMapper.insert(user);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 添加供货商信息
     * @param suppliers
     * @return
     */
    @Override
    public boolean addSuppliers(Suppliers suppliers) {
        int i = suppliersMapper.insert(suppliers);
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
     * 删除供货商信息真删除
     * @param id
     * @return
     */
    @Override
    public boolean removeSuppliers(Integer id) {
        return false;
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

    /**
     * 批量导出供货商信息
     * @param id
     * @return
     */
    @Override
    public List<Suppliers> querySuppliersList(String[] id) {
        return suppliersMapper.querySuppliersList(id);
    }

    /**
     * 查询所有省
     */
    @Override
    public List<AddressProvince> findAll() {
        // TODO Auto-generated method stub
        return addressProvinceMapper.selectAll();
    }

    /**
     * 查询所有市
     */
    @Override
    public List<AddressCity> findByPcode(String pcode) {
        // TODO Auto-generated method stub
        return addressCityMapper.selectByPcode(pcode);
    }

    /**
     * 查询所有县
     */
    @Override
    public List<AddressTown> findTownByCcode(String ccode) {
        // TODO Auto-generated method stub
        return addressTownMapper.selectTownByCcode(ccode);
    }

    /**
     * 比较字段是否重复添加
     * @param username
     * @param password
     * @param userPhone
     * @param userEmail
     * @return
     */
    @Override
    public User selectUserProperty(String username, String password, String userPhone, String userEmail) {
        return userMapper.selectUserProperty(username,password,userPhone,userEmail);
    }
}
