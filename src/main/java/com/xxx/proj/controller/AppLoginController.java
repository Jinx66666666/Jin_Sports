package com.xxx.proj.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Result;
import com.xxx.proj.service.IAppLoginService;

@RestController
@RequestMapping("appUser")
public class AppLoginController {
	@Autowired
	private IAppLoginService service;

	/**
	 * 登录
	 * 
	 * @return
	 */
	@RequestMapping("login")
	public Result userLogin(String tel, String password) {
		System.out.println("_------------" + tel + "----------" + password);
		Result userLogin = service.userLogin(tel, password);
		return userLogin;

	}

	/**
	 * 发送  验证码
	 * tel 手机号，
	 * type，类型，注册为0，  找回密码为1
	 * 
	 * @return
	 */
	@RequestMapping("sendSms")
	public Result sendSms(String tel,int type) {
		Result result = service.sendSms(tel,type);
		return result;
	}

	/**
	 * 注册
	 * 
	 * @return
	 */
	@RequestMapping("register")
	public Result register(String tel, String code, String password) {
		System.out.println(code + "------------------" + tel + "----" + password);
		Result register = service.register(tel, code, password);
		return register;

	}

	/**
	 * 找回密码
	 * 
	 * @return
	 */
	@RequestMapping("backPsw")
	public Result backPsw(String tel, String code, String password) {

		Result backPsw = service.backPsw(tel, code, password);
		return backPsw;
	}
}
