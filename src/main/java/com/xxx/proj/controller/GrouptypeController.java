package com.xxx.proj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Grouptype;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.service.IGrouptypeService;

@RestController
@RequestMapping("/grouptype")
public class GrouptypeController {

	@Autowired
	private IGrouptypeService service;
	
	
	/**
	 * 
	 * @param query
	 *            分页和条件查询
	 * @return
	 */
	@RequestMapping("getlist")
	public Map getGrouptypeList(@RequestBody EmpQuery query) {
		System.out.println("-----------" + query);
		System.out.println("-----------" + query.getPage() + "---" + query.getCount());
		Map grouptypeList = service.getGrouptypeList(query);
		return grouptypeList;
	}

	/**
	 * id存在修改 id不存在保存
	 * 
	 * @param grouptype
	 * @return
	 */
	@RequestMapping("saveGrouptype")
	public Result saveGrouptype(@RequestBody Grouptype grouptype) {
		System.out.println("-----------------");
		System.out.println(grouptype);
		Result result = service.saveGrouptype(grouptype);
		System.out.println("成功了");
		return result;
	}

	/**
	 * id 查个人信息
	 * 
	 * @param grouptype
	 * @return
	 */
	@RequestMapping("selectGrouptype")
	public Map selectGrouptype(Integer id) {
	
		return service.selectGrouptype(id);
	}
	/**
	 * id数组多条删除
	 * 
	 * @param grouptype
	 * @return
	 */
	@RequestMapping("deletelist")
	public void deleteList(@RequestBody int[] ids) {
	
		service.deleteList(ids);
		
		
	}
}
