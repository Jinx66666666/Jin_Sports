package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.Login;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.query.UserQuery;

public interface IUsersMapper {
	


	List<UserPeople> getUsers(UserQuery query);

	Integer getTotal(UserQuery query);

	int addUser(UserPeople e);

	int editUser(UserPeople e);

	UserPeople getUserByID(int id);

	void deleteUsers(int[] ids);



}
