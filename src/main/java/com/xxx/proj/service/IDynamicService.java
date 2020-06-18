package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.DynamicQuery;

public interface IDynamicService {
	
	/**
	 * 分页+搜索  最新动态信息
	 * @param query
	 * @return
	 */
	Map getDynamic(DynamicQuery query);

	
	
	/**
	 * 添加最新动态信息
	 * @param d
	 * @return
	 */
	Result addDynamic(Dynamic d);

	/**
	 * 修改最新动态信息
	 * @param d
	 * @return
	 */
	Result editDynamic(Dynamic d);
	/**
	 * 根据该行id查询最新动态信息
	 * @param id
	 * @return
	 */
	Dynamic getDynamicByID(int id);

	/**
	 * 根据id批量删除最新动态
	 * @param ids
	 * @return
	 */
	Result deleteDynamic(int[] ids);
	


	



	



	

	





}
