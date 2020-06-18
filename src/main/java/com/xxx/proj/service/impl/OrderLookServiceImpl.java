package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.OrderLook;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.IOrderLookMapper;
import com.xxx.proj.query.OrderLookQuery;
import com.xxx.proj.service.IOrderLookService;
import com.xxx.proj.util.EmpUtil;
@Service
@Transactional
public class OrderLookServiceImpl implements IOrderLookService{
@Autowired
	private IOrderLookMapper OrderLookmapper;
	@Override
	public Map getOrderLook(OrderLookQuery query) {
		List<Map> getorderlook = OrderLookmapper.getOrderLook(query);
		Integer gettotal = OrderLookmapper.getTotal(query);
		Map map = new HashMap();
		map.put("getorderlook", getorderlook);
		map.put("gettotal", gettotal);
		return map;
		
	}
	@Override
	public OrderLook getOrderLookById(int id) {
		return OrderLookmapper.getOrderLookById(id);
	}
	@Override
	public Result editOrderlook(OrderLook o) {
		Employee emp = EmpUtil.getEmp();
		/*System.out.println(emp.getName());*/
		o.setName(emp.getName());
		OrderLookmapper.editOrderlook(o);
		return new Result(200,"修改成功");
	}
	@Override
	public Map getExcelOrderLook() {
		List<OrderLook> applyData = OrderLookmapper.getExcelOrderLook();
		
		Map<Object, Object> hashMap = new LinkedHashMap<>();
		
		hashMap.put("applyData", applyData);
		return  hashMap;
	}
	
}
