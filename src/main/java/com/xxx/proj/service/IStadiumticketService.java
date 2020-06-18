package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.Stadiumticket;
import com.xxx.proj.query.StadiumticketQuery;

public interface IStadiumticketService {
	/**
	 * 分页+搜索 场馆票务订单信息
	 * @param query
	 * @return
	 */
	Map getStadiumticket(StadiumticketQuery query);

	/**
	 * 根据id获取信息
	 * @param id
	 * @return
	 */
	Stadiumticket getStadiumticketById(int id);

	/**
	 * 查询数据，显示统计图
	 * @return
	 */
	Map getSurface();

}
