package com.xxx.proj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.service.IAppOrderService;
import com.xxx.proj.util.UserUtil;

@RestController
@RequestMapping("/apporder")
public class AppOrderController {
	
	@Autowired
	private IAppOrderService orderservice;

	/**
	 * 查询订单
	 * @param num
	 * @return
	 */

	@RequestMapping("/orderQuery")
	public List<JinApplyIndent> getOrder(int num){
		return orderservice.getOrder(num);
	}
	/**
	 * 获取票务订单
	 * @return
	 */
	@RequestMapping("/getTicketOrder")
    public List<Map> getTicketOrder(){
		List<Map> order = orderservice.getTicketOrder();
		return order;
    }
}
