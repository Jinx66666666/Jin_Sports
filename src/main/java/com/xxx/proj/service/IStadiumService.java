package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Stadium;
import com.xxx.proj.query.StadiumQuery;

public interface IStadiumService {
	/**
	 * 分页+搜索 场馆信息
	 * @param query
	 * @return
	 */
	Map getStadium(StadiumQuery query);
	/**
	 * 下拉框显示体育场名称
	 * @return
	 */
	List<Map> getSport();
	/**
	 * 添加场馆信息
	 * @param s
	 * @return
	 */
	Result addStadium(Stadium s);
	/**
	 * 修改场馆信息
	 * @param s
	 * @return
	 */
	Result editStadium(Stadium s);
	/**
	 * 根据id获取场馆信息
	 * @param id
	 * @return
	 */
	Stadium getStadiumById(int id);
	/**
	 * 根据id删除场馆信息
	 * @param ids
	 * @return
	 */
	Result deleteStadium(int[] ids);

}
