package com.xxx.proj.mapper;

import org.apache.ibatis.annotations.Param;

import com.xxx.proj.entity.UserPeople;

public interface IAppLoginMapper {

	/**
	 * 
	 * @return 查询要修改密码的目标存在否
	 */
	Integer backPsw(@Param("tel") String tel);

	/**
	 * 
	 * @param tel
	 * @param password
	 *            手机号和密码，修改密码
	 * @return
	 */
	Integer updataPassWord(@Param("tel") String tel, @Param("password") String password);

	/**
	 * 添加用户
	 * 
	 * @param tel
	 * @param password
	 * @return
	 */
	Integer insertRegister(@Param("tel") String tel, @Param("password") String password);

	/**
	 * 用户登录
	 * 
	 * @param tel
	 * @param password
	 * @return
	 */
	UserPeople userLogin(@Param("tel") String tel);

}
