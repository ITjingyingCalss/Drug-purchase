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
public class Role {
    private int roleId;
    private String roleName;
    private String description;
}
