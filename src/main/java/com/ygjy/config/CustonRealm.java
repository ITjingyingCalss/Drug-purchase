package com.ygjy.config;

import com.ygjy.systemmanagement.pojo.User;
import com.ygjy.systemmanagement.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/*
*
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
*/

public class CustonRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
/*
*
     * 授权
     * @param principalCollection
     * @return

*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=>授权doGetAuthorrizationInfo");
        //用户授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //拿到当前登录对象
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User)subject.getPrincipal();//拿到user对象
        info.addStringPermission(String.valueOf(currentUser.getRole().getJurisdiction().getPermissionPerms()));
        return info;
    }
/**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行了=>认证doGetAuthorizationInfo");
        //获取数据库数据
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        User user=null;
        try{
            user= userService.loginByUsername(userToken.getUsername());
        }catch (Exception E){
            System.out.println(E.getMessage());
        }
        if(user == null){
            //没有该用户,返回空
            //UnknowAccountException
            return null;
        }
        Subject currentSubject  = SecurityUtils.getSubject();
        Session session = currentSubject.getSession();
        session.setAttribute("loginUser",user);
        return new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),"custonRealm");
    }
}
