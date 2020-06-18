package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.Login;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;

public interface IEmpService {
	/**
	 * 员工登陆
	 * @param login 登陆用户名和密码
	 * @return 状态码
	 */
	Result empLogin(Login login);

	/**
	 *  获取员工的权限
	 * @return
	 */
	List<Map> getPermission();
	
	
	/**
	 * 分页+搜索 员工信息
	 * @param query
	 * @return
	 */
	Map getEmp(EmpQuery query);

	/**
	 * 查询部门信息
	 * @return
	 */
	List<Map> getDept();

	/**
	 * 查询角色信息
	 * @return
	 */
	List<Map> getRole();

	/**
	 * 添加用户信息，登录账号
	 * @param e
	 * @return
	 */
	Result addEmp(Employee e);

	/**
	 * 修改用户信息
	 * @param e
	 * @return
	 */
	Result editEmp(Employee e);
	/**
	 * 根据该行id查询用户信息
	 * @param id
	 * @return
	 */
	Employee getEmpByID(int id);

	/**
	 * 根据id批量删除信息
	 * @param ids
	 * @return
	 */
	Result deleteEmp(int[] ids);
	/**
	 * 个人中心查询
	 * @return
	 */
	List<Map> getMy();

	Result editPassword(Login login);





}
