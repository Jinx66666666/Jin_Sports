package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.OrderLook;
import com.xxx.proj.query.OrderLookQuery;

public interface IOrderLookMapper {

	List<Map> getOrderLook(OrderLookQuery query);

	Integer getTotal(OrderLookQuery query);

	OrderLook getOrderLookById(int id);

	void editOrderlook(OrderLook o);

	List<Map> getOrderLookList();

	List<OrderLook> getExcelOrderLook();
	
}
