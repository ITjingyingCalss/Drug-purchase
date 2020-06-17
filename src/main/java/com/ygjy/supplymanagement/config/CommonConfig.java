package com.ygjy.supplymanagement.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * @author: 赵林
 * @Date: 2020/6/17 14:08
 * @Description:
 */
@Configuration
public class CommonConfig {

 @Bean
    public MultipartConfigElement multipartConfigElement() {
            MultipartConfigFactory factory = new MultipartConfigFactory();
            //factory.setMaxFileSize(1024 * 1024); // 限制上传文件大小
            return factory.createMultipartConfig();
 }
}
