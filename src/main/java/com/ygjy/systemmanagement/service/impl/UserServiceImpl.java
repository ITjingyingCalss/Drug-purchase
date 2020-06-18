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

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private JurisdictionMapper jurisdictionMapper;

    @Autowired
    private HospitalMapper hospitalMapper;

    @Autowired
    private ProxyMonitorMapper proxyMonitorMapper;
/**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询**查询/

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
     * 查询所有角色
     * @return
     */
    @Override
    public List<Role> findRoleAll() {
        return roleMapper.selectRoleAll();
    }

    /**
     * 查询所有权限
     * @return
     */
    @Override
    public List<Jurisdiction> findJurisdictionAll() {
        return jurisdictionMapper.selectJurisdictionAll();
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
     * 查询所有医院信息
     * @param hospitalName
     * @param hospitalLevel
     * @param hospitalType
     * @return
     */
    @Override
    public List<Hospital> findAllHospital(String hospitalName, String hospitalLevel, String hospitalType) {
        return hospitalMapper.selectAllHospital(hospitalName,hospitalLevel,hospitalType);
    }

    /**
     * 批量导出医院信息
     * @param id
     * @return
     */
    @Override
    public List<Hospital> queryHospitalList(String[] id) {
        return hospitalMapper.queryHospitalList(id);
    }

    /**
     * 验证医院表单属性合理性
     * @param hospitalName
     * @param hospitalTelephone
     * @param hospitalFax
     * @param pharmacyTelephone
     * @return
     */
    @Override
    public Hospital findHospitalProperty(String hospitalName, String hospitalTelephone, String hospitalFax, String pharmacyTelephone) {
        return hospitalMapper.selectHospitalProperty(hospitalName,hospitalTelephone,hospitalFax,hospitalTelephone);
    }

    /**
     * 查询所有监督信息
     * @param proxyMonitorId
     * @param proxyMonitorName
     * @param proxyMonitorAddress
     * @return
     */
    @Override
    public List<ProxyMonitor> findProxyMonitorAll(Integer proxyMonitorId, String proxyMonitorName, String proxyMonitorAddress) {
        return proxyMonitorMapper.selectProxyMonitorAll(proxyMonitorId,proxyMonitorName,proxyMonitorAddress);
    }

    /***
     * 批量操作监督机构信息
     * @param id
     * @return
     */
    @Override
    public List<ProxyMonitor> queryProxyMonitorList(String[] id) {
        return proxyMonitorMapper.queryProxyMonitorList(id);
    }
/**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新**更新*/
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
     * 更新角色信息
     * @param role
     * @return
     */
    @Override
    public boolean updateRoleInfo(Role role) {
        int i = roleMapper.updateByPrimaryKeySelective(role);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 更新权限信息
     * @param jurisdiction
     * @return
     */
    @Override
    public boolean updateJurisdiction(Jurisdiction jurisdiction) {
        int i = jurisdictionMapper.updateByPrimaryKey(jurisdiction);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 修改医院信息
     * @param hospital
     * @return
     */
    @Override
    public boolean updateHospital(Hospital hospital) {
        int i = hospitalMapper.updateByPrimaryKey(hospital);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }
/**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加**添加*/
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
     * 添加角色信息
     * @param role
     * @return
     */
    @Override
    public boolean addRole(Role role) {
        int i = roleMapper.insert(role);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 添加新权限
     * @param jurisdiction
     * @return
     */
    @Override
    public boolean addJurisdiction(Jurisdiction jurisdiction) {
        int i = jurisdictionMapper.insert(jurisdiction);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 添加医院信息
     * @param hospital
     * @return
     */
    @Override
    public boolean addHospital(Hospital hospital) {
        int i =hospitalMapper.insert(hospital);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }
/**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除**删除*/
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
     * 通过id删除角色
     * @param id
     * @return
     */
    @Override
    public boolean reomoveRoleInfo(Integer id) {
        int i = roleMapper.deleteByPrimaryKey(id);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 通过id删除权限
     * @param id
     * @return
     */
    @Override
    public boolean removeJurisdiction(Integer id) {
        int i = jurisdictionMapper.deleteByPrimaryKey(id);
        if (i > 0 ){
            return true;
        }else {
            return false;
        }
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
