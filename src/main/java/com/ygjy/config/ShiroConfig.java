/*
package com.ygjy.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.ResponseCache;
import java.util.LinkedHashMap;
import java.util.Map;

*/
/*
*
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
*//*






@Configuration
public class ShiroConfig {
*/
/**
     * 第三步//shiroFilterFactoy
     * @param securityManager
     * @return*//*




    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(securityManager);
        //添加shiro过滤器
*/
/*
        *
         * anao:无需认证就可访问
         * authc:必须认证才可以访问
         * user:必须拥有记住我才能访问
         * perms:拥有对某个资源的权限才可以访问
         * role:拥有某个角色权限才可以访问
         *
*//*





*/
/*
filterMap.put("/user/add","authc");
        filterMap.put("/user/update","authc");

*//*



        //拦截
        Map<String,String> filterMap = new LinkedHashMap<>();
        //添加认证,拦截器
        //授权.正常情况下,未授权会跳转未授权页面
        filterMap.put("/systemmanagement/user_control","perms[user:1]");
        filterMap.put("/user/update","perms[user:update]");


        //通配符模式
        filterMap.put("/user/*","authc");
        bean.setFilterChainDefinitionMap(filterMap);
        //设置登录请求
        bean.setLoginUrl("/toLogin");
        //未授权页面
        bean.setUnauthorizedUrl("/noauth");
        return bean;
    }

*/
/*    *
         * 第二步//DafaultWebSecurityManager
         * @param custonRealm
         * @return
    *//*






    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("custonRealm") CustonRealm custonRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联UserRealm
        securityManager.setRealm(custonRealm);
        return securityManager;
    }

*/
/*    *第一步//创建  Realm对象  自定义
         * 注入Bean，由Spring托管
         * @return
    *//*



    @Bean
    public CustonRealm custonRealm(){
        return new CustonRealm();
    }

    //整合shiroDialect;用来整合shiro和thymeleaf
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
*/
