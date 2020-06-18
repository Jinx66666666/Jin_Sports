package com.xxx.proj.util;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.UserPeople;



public final class UserUtil {

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
     * 获取session中 当前登陆的用户对象
     * @param session
     * @return user
     */
    public static UserPeople getUserPeople() {
    	System.out.println("session输出:"+getSession().getAttribute("USERPEOPLE"));
        return (UserPeople) getSession().getAttribute("USERPEOPLE");
    }
    
    /***
     * 存储当前登陆员工到 session中
     * @param userPeople
     */
    public static void setUserPeople(UserPeople userPeople) {

    
        getSession().setAttribute("USERPEOPLE", userPeople);

    }

    public static void removeUserPeople() {
        HttpSession session = getSession();
        session.invalidate();
    }
    
}