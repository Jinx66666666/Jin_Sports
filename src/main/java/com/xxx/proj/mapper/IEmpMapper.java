package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.Login;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;

public interface IEmpMapper {
	Integer empLogin(Login login);
	
	Employee getEmpByLoginID(Integer id);

	List<Map> getPermission(int roleID);

	List<Map> getEmp(EmpQuery query);

	Integer getTotal(EmpQuery query);

	List<Map> getDept();

	List<Map> getRole();

	void addLoginAccount(Login login);

	void addEmp(Employee e);

	void editEmp(Employee e);

	Employee getEmpByID(int id);

	void deleteEmp(int[] ids);

	List<Map> getMy(int loginID);

	void editPassword(Login login);


}
