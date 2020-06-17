package com.ygjy.supplymanagement.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: 赵林
 * @Date: 2020/6/17 9:27
 * @Description:
 */
public interface UserService {

    /**
     * 读取excel中的数据,生成list
     */
    String readExcelFile( MultipartFile file);
}
