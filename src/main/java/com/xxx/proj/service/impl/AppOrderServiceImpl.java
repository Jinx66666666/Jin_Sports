package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.mapper.IAppOrderMapper;
import com.xxx.proj.service.IAppOrderService;
import com.xxx.proj.util.CodeSessionUtil;
import com.xxx.proj.util.UserUtil;
@Service
@Transactional
public class AppOrderServiceImpl implements IAppOrderService{

	@Autowired
	private IAppOrderMapper orderMapper;
	
	/**
	 * App个人中心订单查询
	 */
	@Override
	public List<JinApplyIndent> getOrder(int num) {

		String tel = UserUtil.getUserPeople().getTel();

		String paystate = null;
		if (num==0) {
			 paystate="";
		}else if(num==1){
			paystate="未支付";
		}else if(num==2){
			paystate ="已支付";
		}
		List<JinApplyIndent> order = orderMapper.getOrder(tel,paystate);
		return order;
	}
	/**
	 * 查询订单详细信息
	 */
	@Override
	public List<Map> getTicketOrder() {
		String tel = UserUtil.getUserPeople().getTel();
		List<Map> order = orderMapper.getTicketOrder(tel);
		return order;
	}

	
	


}
