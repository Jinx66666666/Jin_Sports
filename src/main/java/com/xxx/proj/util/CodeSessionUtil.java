package com.xxx.proj.util;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xxx.proj.entity.Employee;



public final class CodeSessionUtil {

    private static HttpSession getSession() {
        HttpSession session = null;
        try {
            session = getRequest().getSession();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return session;
    }

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attrs.getRequest();
    }
    
    /**
     * 获取session中 当前注册手机号
     * @param session
     * @return user
     */
    public static String getTel() {
        return  (String) getSession().getAttribute("tel");
    }
    /***
     *获取session中的短信验证码 
     *
     */
    public static String getCode() {
    	return  (String) getSession().getAttribute("code");
    }
    
    /***
     * 
     * 存储当前登陆员工到 session中
     * @param emp
     */
    public static void setSenCodeSession(String tel,String code) {
    	removeCode();
        getSession().setAttribute("tel", tel);
        getSession().setAttribute("code", code);
    }

    public static void removeCode() {
        HttpSession session = getSession();
        session.invalidate();
    }
    
}