package com.xxx.proj.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.OrderLook;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Stadiumticket;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.mapper.IAppStadiumticketMapper;
import com.xxx.proj.service.IAppStadiumticketService;
import com.xxx.proj.util.CodeSessionUtil;
import com.xxx.proj.util.UserUtil;

import groovy.transform.builder.InitializerStrategy.SET;
@Service
@Transactional
public class AppStadiumticketServiceImpl implements IAppStadiumticketService{

	@Autowired
	private IAppStadiumticketMapper mapper;
	/** 
	 * App端添加场馆票务预定
	 */
	@Override
	public String editStadiumticket(Stadiumticket s) {
		s.setPaymenttype("支付宝支付");
		s.setState("未支付");
		//给数据库插入当前时间为下单时间，插入对应的订单编号
		Date date = new Date(); 
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss");
		String time=formatter.format(date);
		s.setOrderdate(date);
		s.setOrdernum(time);
		//获取当前登录的用户账号
		System.out.println(UserUtil.getUserPeople().getTel());
		s.setLoginid(UserUtil.getUserPeople().getTel());
		mapper.editStadiumticket(s);
		return time;

}
	@Override
	public Map editorderlook(OrderLook o) {
		// TODO Auto-generated method stub
		o.setState(0);
		Date date1 = new Date(); 
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss");
		String time1=formatter.format(date1);
		o.setCode(time1);
		return mapper.editorderlook(o);
		
	}
}