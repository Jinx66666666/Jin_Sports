package com.xxx.proj.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.mapper.IAppLoginMapper;
import com.xxx.proj.service.IAppLoginService;
import com.xxx.proj.util.CodeSessionUtil;
import com.xxx.proj.util.EmpUtil;
import com.xxx.proj.util.ProduireCode;
import com.xxx.proj.util.UserUtil;

@Service
public class AppLoginServiceImpl implements IAppLoginService {

	@Autowired
	private IAppLoginMapper mapper;

	/*
	 * *
	 * 发验证码 type,注册0 找回密码为1
	 * 
	 * 
	 * @return
	 */
	@Override
	public Result sendSms(String tel, int type) {

		if (0 == type) { // 注册
			// 注册判断，如果当前手机号已注册 则返回信息该账号已存在！
			Integer integer = mapper.backPsw(tel);
			if (integer != 0) {
				return new Result(300, "手机号已存在");
			}
		} else { // 密码找回
			// 密码找回判断，如果当前手机号未注册 则返回信息该账号不存在存在！
			Integer integer = mapper.backPsw(tel);
			if (integer == 0) {
				return new Result(300, "手机号未注册");
			}
		}
		// 给当前手机号发送验证码并将当前手机号和验证那存入session中
		ProduireCode.produireCode(tel);
		return new Result(200, "成功！");
	}

	/**
	 * 忘记密码， 修改密码 根据账号查存在否 修改密码
	 */
	@Override
	public Result backPsw(String tel, String code, String password) {
		String tel2 = CodeSessionUtil.getTel();
		String code2 = CodeSessionUtil.getCode();
		System.out.println(tel2 + "===========" + code2);
		System.out.println(tel + "======" + tel2);
		if (!tel.equals(tel2)) {
			return new Result(400, "请检查手机号是否正确！");
		}
		if (!code.equals(code2)) {
			return new Result(400, "验证码错误！");
		}
		mapper.updataPassWord(tel, password);
		return new Result(200, "修改成功");
	}

	/**
	 * 注册，失败
	 * 
	 * 从session中取 验证码 判断，手机号和验证码是否这个正确
	 */
	@Override
	public Result register(String tel, String code, String password) {

		String tel2 = CodeSessionUtil.getTel();
		String code2 = CodeSessionUtil.getCode();
		System.out.println(tel2 + "===========" + code2);
		System.out.println(tel + "======" + tel2);
		if (!tel.equals(tel2)) {
			return new Result(400, "请检查手机号是否正确！");
		}

		if (!code.equals(code2)) {
			return new Result(400, "验证码错误！");
		}

		Integer insertRegister = mapper.insertRegister(tel, password);
		if (insertRegister != 1) {
			return new Result(400, "网络异常，请联系客服");
		}

		return new Result(200, "注册成功");
	}

	/**
	 * 用户登录
	 */
	@Override
	public Result userLogin(String tel, String password) {
		Date date = new Date();
		System.out.println(date);

		Integer integer = mapper.backPsw(tel);
		if (integer == 0) {
			return new Result(300, "账号不存在，请注册账号");
		}
		UserPeople userLogin = mapper.userLogin(tel);
		if (!password.equals(userLogin.getPassword())) {
			return new Result(400, "密码错误");
		}
	
		UserUtil.setUserPeople(userLogin); // 员工村session中

		return new Result(200, "登录成功");
	}

}
