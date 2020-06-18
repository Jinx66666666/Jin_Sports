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
import com.xxx.proj.mapper.IEmpMapper;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.service.IEmpService;
import com.xxx.proj.util.EmpUtil;
@Service
@Transactional
public class EmpServiceImpl implements IEmpService{

	@Autowired
	private IEmpMapper empMapper;
	@Override
	public Result empLogin(Login login) {
		// TODO Auto-generated method stub
		Integer id = empMapper.empLogin(login);
		if(id==null){
			return new Result(400,"你输入的账号或密码错误");
		}
		Employee empByLoginID = empMapper.getEmpByLoginID(id);
		System.out.println(empByLoginID.getState());
		if(empByLoginID.getState()==0){
			return new Result(300,"该账户已冻结");
		}
		 EmpUtil.setEmp(empByLoginID);
			
			return new Result(200, "登陆成功");
	}

	@Override
	public List<Map> getPermission() {
		
		Employee emp = EmpUtil.getEmp();
		
		return empMapper.getPermission(emp.getRoleID());
	}

	@Override
	public Map getEmp(EmpQuery query) {
		
		List<Map> getemp = empMapper.getEmp(query);
		Integer gettotal = empMapper.getTotal(query);
		Map map = new HashMap();
		map.put("getemp", getemp);
		map.put("gettotal", gettotal);
		return map;
		
	}

	@Override
	public List<Map> getDept() {
		
		return empMapper.getDept();
	}

	@Override
	public List<Map> getRole() {
		
		return empMapper.getRole();
	}

	@Override
	public Result addEmp(Employee e) {
		Login login = new Login(0,e.getTelephone() ,"123456");
		empMapper.addLoginAccount(login);
		
		e.setLoginID(login.getId());
		empMapper.addEmp(e);
		
		return new Result(200, "添加成功");
	}

	
	@Override
	public Result editEmp(Employee e) {
		empMapper.editEmp(e);
		return new Result(200, "修改成功");
	}

	@Override
	public Employee getEmpByID(int id) {
		
		return empMapper.getEmpByID(id);
	}

	@Override
	public Result deleteEmp(int[] ids) {
		empMapper.deleteEmp(ids);
		return new Result(200,"删除成功");
	}
	/**
	 * 个人中心查询
	 */
	@Override
	public List<Map> getMy() {
		Employee emp = EmpUtil.getEmp();
		return empMapper.getMy(emp.getLoginID());
	}
	/**
	 * 修改密码
	 */
	@Override
	public Result editPassword(Login login) {
		Employee emp = EmpUtil.getEmp();
		Integer id = emp.getId();
		login.setId(id);
		 empMapper.editPassword(login);
		 return new Result(200, "修改成功");
	}

	

}
