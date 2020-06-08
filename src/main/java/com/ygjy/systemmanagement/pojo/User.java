package com.ygjy.systemmanagement.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 描述
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String userAccount;
    private String userName;
    private int roleId;
    private String password;
    private int userState;
    private int unitId;
    private String userAddress;
    private String postalCode;
    private String contacts;
    private String phone;
    private String email;
    private Role role;
}
