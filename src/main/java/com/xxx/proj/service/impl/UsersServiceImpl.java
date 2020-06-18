package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.Login;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.mapper.IEmpMapper;
import com.xxx.proj.mapper.IUsersMapper;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.query.UserQuery;
import com.xxx.proj.service.IEmpService;
import com.xxx.proj.service.IUsersService;
import com.xxx.proj.util.EmpUtil;
import com.xxx.proj.util.UserUtil;
@Service
@Transactional
public class UsersServiceImpl implements IUsersService{

	@Autowired
	private IUsersMapper usersMapper;
	

	/**
	 * 查询用户列表
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public Map getUsers(UserQuery query) {
		
		List<UserPeople> getusers = usersMapper.getUsers(query);
		Integer gettotal = usersMapper.getTotal(query);
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("getusers", getusers);
		map.put("gettotal", gettotal);
		return map;
		
	}
	/** 
	 * 添加用户
	 */
	@Override
	public Result addUser(UserPeople e) {
		int i = usersMapper.addUser(e);
		if (i==1) {
			return new Result(200, "添加成功");
		}
		return new Result(400,"添加失败");
	}

	/**
	 * 编辑用户
	 */
	@Override
	public Result editUser(UserPeople e) {
		int i = usersMapper.editUser(e);
		if(i==1){
		return new Result(200, "修改成功");
		}
		return new Result(400,"修改失败");
	}
	/**
	 * 点击编辑时查询出该用户信息
	 */
	@Override
	public UserPeople getUserByID(int id) {
		
		return usersMapper.getUserByID(id);
	}
	/**
	 * 批量删除用户
	 */
	@Override
	public Result deleteUsers(int[] ids) {
		usersMapper.deleteUsers(ids);
		return new Result(200,"删除成功");
	}
	
	

}
