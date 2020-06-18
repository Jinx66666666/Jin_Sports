package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.JinApplyIndent;

public interface IAppOrderService {

	/**
	 * 获取赛事订单
	 * @param num
	 * @return
	 */
	List<JinApplyIndent> getOrder(int num);
	/**
	 * 获取票务订单
	 * @return
	 */
	List<Map> getTicketOrder();
	
	



	



	

	





}
