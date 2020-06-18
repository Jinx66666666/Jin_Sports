package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.mapper.IAppReviewMapper;
import com.xxx.proj.query.AppQuery;
import com.xxx.proj.query.SportsQuery;
import com.xxx.proj.service.IAppReviewService;

@Service
@Transactional
public class AppReviewServiceImpl implements IAppReviewService {
	@Autowired
	private IAppReviewMapper appReviewMapper;

	/**
	 * 查询精彩回顾
	 * 
	 * 返回 添加查询， 和查询的总条数
	 */
	/*@Override
	public Map getAppReview(AppQuery appQueryg) {
		
		 * List<Map> appReview = appReviewMapper.getAppReview(g); Map map = new
		 * HashMap(); map.put("appReview", appReview);
		 
		
		return null;
	}*/
	@Override
	public Map getAppInReview(AppQuery a) {
		List<Map> getAppReview =  appReviewMapper.getAppInReview(a);
		Integer gettotal = appReviewMapper.getTotal(a);
		Map map = new HashMap();
		map.put("getAppReview", getAppReview);
		map.put("gettotal", gettotal);
		System.out.println("---------------");
		System.out.println(getAppReview);
		return map;
	}

}
