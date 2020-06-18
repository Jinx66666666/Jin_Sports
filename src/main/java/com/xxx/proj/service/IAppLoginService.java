package com.xxx.proj.service;

import com.xxx.proj.entity.Result;

public interface IAppLoginService {

	/**
	 * 验证码
	 * 
	 * @param tel
	 * @param type 
	 * @param type
	 * @return
	 */
	Result sendSms(String tel, int type);

	/**
	 * 修改密码
	 * 
	 * @param password
	 * @param code
	 * @param tel
	 * 
	 * @return
	 */
	Result backPsw(String tel, String code, String password);

	/**
	 * 注册
	 * 
	 * @param password
	 * @param code
	 * @param tel
	 */
	Result register(String tel, String code, String password);

	/**
	 * 用户登录
	 * 
	 * @param tel
	 * @param password
	 * @return
	 */
	Result userLogin(String tel, String password);

}
