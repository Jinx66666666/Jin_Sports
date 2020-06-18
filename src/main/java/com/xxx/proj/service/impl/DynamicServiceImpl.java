package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.IDynamicMapper;
import com.xxx.proj.query.DynamicQuery;
import com.xxx.proj.service.IDynamicService;
@Service
@Transactional
public class DynamicServiceImpl implements IDynamicService{

	@Autowired
	private IDynamicMapper dynamicMapper;
	

	/**
	 * 查询最新动态列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map getDynamic(DynamicQuery query) {
		
		List<Dynamic> getdynamic = dynamicMapper.getDynamic(query);
		Integer gettotal = dynamicMapper.getTotal(query);
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("getdynamic", getdynamic);
		map.put("gettotal", gettotal);
		return map;
		
	}
	/** 
	 * 添加最新动态
	 */
	@Override
	public Result addDynamic(Dynamic e) {
		dynamicMapper.addDynamic(e);
		
		return new Result(200, "添加成功");
	}

	/**
	 * 编辑最新动态
	 */
	@Override
	public Result editDynamic(Dynamic e) {
		dynamicMapper.editDynamic(e);
		return new Result(200, "修改成功");
	}
	/**
	 * 点击编辑时查询出该最新动态信息
	 */
	@Override
	public Dynamic getDynamicByID(int id) {
		
		return dynamicMapper.getDynamicByID(id);
	}
	/**
	 * 批量删除最新动态
	 */
	@Override
	public Result deleteDynamic(int[] ids) {
		dynamicMapper.deleteDynamic(ids);
		return new Result(200,"删除成功");
	}
	
	

}
