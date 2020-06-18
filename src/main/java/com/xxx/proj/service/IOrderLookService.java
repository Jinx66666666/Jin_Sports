package com.xxx.proj.service;


import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.OrderLook;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.OrderLookQuery;

public interface IOrderLookService {
	/**
	 * 分页+搜索 体育场信息
	 * @param query
	 * @return
	 */
	Map getOrderLook(OrderLookQuery query);
	/**
	 * 根据id查询销核表数据
	 * @param id
	 * @return
	 */
	OrderLook getOrderLookById(int id);
	/**
	 * 修改状态
	 * @param o
	 * @return
	 */
	Result editOrderlook(OrderLook o);
	
	/**
	 * 查询数据用来导出excel
	 * @return
	 */
	Map getExcelOrderLook();

}
