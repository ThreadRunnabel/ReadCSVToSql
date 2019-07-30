/**
 * @Title: StringUtil.java
 * @Package com.webgis.common.utils
 */
package com.util;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * *********************************
* @ClassName: StringUtil.java
* @Description: 字符相关类
* @author: Thread
* @createdAt: 2019年7月30日下午6:12:12
**********************************
 */

public class StringUtil {
    /**
     * check if the string is blank "" and null return true
     * 
     */
    public static boolean isBlank(String str) {
        boolean flag = false;
        if (str == null || "".equals(str.trim())){
            flag = true;
        }
        return flag;
    }
    
    
    public static boolean isBlank(Integer str) {
        if (null != str){
            return isBlank(str.toString());
        }
        return true;
    }
    
    
    public static boolean isBlank(Object obj) {
        if (obj != null){
            return false;
        }
        return true;
    }
    
    
    /**
     * 
     * @Title: isBlank
     * @Description: 验证bigdecimal是否为空,如果是0.0判断不为空
     * @param bigDecimal
     * @return
     * @createdBy:quansheng
     * @createaAt:2016年5月10日上午10:38:40
     */
    public static boolean isBlank(BigDecimal bigDecimal) {
        boolean flag = false;
        if (bigDecimal == null || "".equals(bigDecimal)){
            flag = true;
        }
        return flag;
    }
    
    
    /**
     * check if the String is not Blank "" and null return false
     * 
     * @param str
     * @return
     */
    public static boolean isNotBlank(String str) {
        boolean flag = false;
        if (str != null && !"".equals(str) && !"null".equals(str)){
            flag = true;
        }
        return flag;
    }
    
    
    /**
     * check if the Object is not Blank "" and null return false
     * 
     * @param str
     * @return
     */
    public static boolean isNotBlank(Object obj) {
        boolean flag = false;
        if (obj != null){
            flag = true;
        }
        return flag;
    }
    
    
    /**
     * check if the BigDecimal is not Blank "" and null return false
     * 
     * @param str
     * @return
     */
    public static boolean isNotBlank(BigDecimal bigDecimal) {
        boolean flag = false;
        if (bigDecimal != null && !"".equals(bigDecimal) && bigDecimal.doubleValue() != 0.0){
            flag = true;
        }
        return flag;
    }
    
    
    /**
     * check if the Double is not 0 and null return true
     * 
     */
    public static boolean isNotBlank(Double log) {
        boolean flag = false;
        if (log != null && Math.abs(log) > 0){
            flag = true;
        }
        return flag;
    }
    
    
    /**
     * check if the Integer is not 0 and null return true
     * 
     */
    public static boolean isNotBlank(Integer log) {
        boolean flag = false;
        if (log != null && log > 0){
            flag = true;
        }
        return flag;
    }
    
    
    /**
     * check if the long is not 0 and null return true
     * 
     */
    public static boolean isNotBlank(Long log) {
        boolean flag = false;
        if (log != null && log > 0){
            flag = true;
        }
        return flag;
    }
    
    
    /**
     * check if the long is 0 and null return true
     * 
     */
    public static boolean isBlank(Long log) {
        boolean flag = false;
        if (log == null || log == 0){
            flag = true;
        }
        return flag;
    }    

    
    /**
     * 
    * @Title: isNumeric
    * @Description: 判断是否数字
    * @param str
    * @return
    * @createdBy:Thread
    * @createaAt:2019年7月30日下午6:23:59
     */
    public static boolean isNumeric(String str) {
    	// 该正则表达式可以匹配所有的数字 包括负数
    	Pattern pattern = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
    	String bigStr;
    	try {
    		bigStr = new BigDecimal(str).toString();
    	} catch (Exception e) {
    		return false;//异常 说明包含非数字。
    	}

    	Matcher isNum = pattern.matcher(bigStr); // matcher是全匹配
    	if (!isNum.matches()) {
    		return false;
    	}
    	return true;
	}
}
