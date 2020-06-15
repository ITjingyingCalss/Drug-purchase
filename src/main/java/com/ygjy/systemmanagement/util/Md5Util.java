package com.ygjy.systemmanagement.util;

import sun.security.provider.MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/15
 * Desc: 加密密码
 */
public class Md5Util {
    public static String getMessage(String messsge){
        String temp = "";
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] editMd5 = messageDigest.digest(messsge.getBytes());
            temp = convertByteToHexString(editMd5);
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return  temp;
    }

    public static String convertByteToHexString(byte[] bytes){
        String results = "";
        for (int i = 0; i <bytes.length ; i++) {
            int temp = bytes[i] & 0xff;
            String tempHex = Integer.toHexString(temp);
            if (tempHex.length() < 2) {
                results += "0" + tempHex;
            } else {
                results += tempHex;
            }
        }
        return results;
    }
}