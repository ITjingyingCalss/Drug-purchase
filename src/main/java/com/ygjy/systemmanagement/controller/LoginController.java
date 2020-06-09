package com.ygjy.systemmanagement.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
 */
@Controller
public class LoginController {

    /**+
     * 登录跳转
     * @return
     */
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    /**
     * 判断用户登录信息是否正确
     * @param userName
     * @param password
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(String userName, String password, Model model){
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        //捕获异常
        try{
            //执行登录方法
            subject.login(token);
            return "index";
        }catch (UnknownAccountException e){
            model.addAttribute("msg","用户名错误");
            return "login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }

    /**
     * 判断当前登录用户是否拥有访问当前页面权限
     * @return
     */
    @RequestMapping("/noauth")
    @ResponseBody
    public String unauthorized(){
        return "未经授权无法访问当前页面";
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/exitLogin")
    public  String exitLogin(){
        return "login";
    }
}
