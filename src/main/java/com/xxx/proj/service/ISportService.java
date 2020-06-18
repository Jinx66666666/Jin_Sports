package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.SportAdd;
import com.xxx.proj.query.SportsQuery;

public interface ISportService {

	/**
	 * 分页+搜索 体育场信息
	 * @param query
	 * @return
	 */
	Map getSport(SportsQuery query);
	/**
	 * 添加体育场信息
	 * @param s
	 * @return
	 */
	Result addSports(SportAdd s);
	/**
	 * 修改体育场信息
	 * @param s
	 * @return
	 */
	Result editSports(SportAdd s);
	/**
	 * 根据该行id查询体育场信息
	 * @param id
	 * @return
	 */
	SportAdd getSportById(int id);
	/**
	 * 根据id删除体育场信息
	 * @param ids
	 * @return
	 */
	Result deleteSport(int[] ids);

}
