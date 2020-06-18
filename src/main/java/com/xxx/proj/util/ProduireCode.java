package com.xxx.proj.util;

import com.xxx.proj.entity.Result;
/***
 * @decriptions:产生6位数验证码，发送短信，并存入session中
 * @author Lqq
 * 
 * */
public class ProduireCode {

	public static Result produireCode(String tel){
		int codeInt = (int) (Math.random() * 1000000);
		String code = String.valueOf(codeInt); ///生成随机数 转换为字符串
		SendNum sendNum = new SendNum();
		Result result = sendNum.SendNumDX(tel,code); // 发短信
		//将当前发送接收验证码的手机号存入session中
		CodeSessionUtil.setSenCodeSession(tel, code);
		return result;
	}
	
	
}
