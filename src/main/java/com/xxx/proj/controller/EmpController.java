package com.xxx.proj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.Login;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.service.IEmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private IEmpService empService;
	
	@RequestMapping("/login")
	public Result empLogin(@RequestBody Login login){
		return empService.empLogin(login);
	}
	
	@RequestMapping("/getPermission")
	public List<Map> getPermission(){
		return empService.getPermission();
		
	}
	@RequestMapping("/getEmp")
	public Map getEmp(@RequestBody EmpQuery query){

		return empService.getEmp(query);
	}
	
	@RequestMapping("/getDept")
	public List<Map> getDept(){
		return empService.getDept();
		
	}
	
	@RequestMapping("/getRole")
	public List<Map> getRole(){
		return empService.getRole();
		
	}
	
	@RequestMapping("/addEmp")
	public Result addEmp(@RequestBody Employee e){
		return empService.addEmp(e);
	}
	
	@RequestMapping("/editEmp")
	public Result editEmp(@RequestBody Employee e){
		return empService.editEmp(e);
	}
	
	@RequestMapping("/getEmpByID")
	public Employee getEmpByID(int id){
		return empService.getEmpByID(id);
		
	}
	@RequestMapping("/deleteEmp")
	public Result deleteEmp(@RequestBody int[] ids){
		return empService.deleteEmp(ids);
		
	}
	
	/**
	 * 个人中心查询
	 */
	@RequestMapping("/getMy")
	public List<Map> getMy(){
		return empService.getMy();		
	}
	/**
	 *	修改密码
	 * @return
	 */
	@RequestMapping("/editPassword")
	public Result editPassword(@RequestBody Login login){
		return empService.editPassword(login);
	}
	
}
