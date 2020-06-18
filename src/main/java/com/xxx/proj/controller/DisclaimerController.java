package com.xxx.proj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.service.IDisclaimerListService;

@RestController
@RequestMapping("/disclaimer")
public class DisclaimerController {

	@Autowired
	private IDisclaimerListService service;

	/**  
	 * 
	 * @param query
	 *            分页和条件查询
	 * @return
	 */
	@RequestMapping("getlist")
	public Map getDisclaimerList(@RequestBody EmpQuery query) {
		System.out.println("-----------" + query);
		System.out.println("-----------" + query.getPage() + "---" + query.getCount());
		Map disclaimerList = service.getDisclaimerList(query);
		return disclaimerList;
	} 

	/**
	 * id存在修改 id不存在保存
	 * 
	 * @param disclaimer
	 * @return
	 */
	@RequestMapping("saveDisclaimer")
	public Result saveDisclaimer(@RequestBody Disclaimer disclaimer) {
		System.out.println(disclaimer);
		Result result = service.saveDisclaimer(disclaimer);
		return result;
	}

	/**
	 * id 查个人信息
	 * 
	 * @param disclaimer
	 * @return
	 */
	@RequestMapping("selectDisclaimer")
	public Disclaimer selectDisclaimer(Integer id) {
		return service.selectDisclaimer(id);
	}
	/**
	 * id数组多条删除
	 * 
	 * @param disclaimer
	 * @return
	 */
	@RequestMapping("deletelist")
	public void deleteList(@RequestBody int[] ids) {
		service.deleteList(ids);
		
		
	}
}
