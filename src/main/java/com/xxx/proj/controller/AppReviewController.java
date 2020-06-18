package com.xxx.proj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.GoodReview;
import com.xxx.proj.query.AppQuery;
import com.xxx.proj.query.SportsQuery;
import com.xxx.proj.service.IAppReviewService;

@RestController
@RequestMapping("/appReview")
public class AppReviewController {
	@Autowired
	private IAppReviewService appReviewService;
	

	/**
	 *  * 条件查询
	 * 	 pageNo:pageNo,   页码
		 pageSize:pageSize 一页数量
	 * ，  查总数量count
	 * @param appQueryg  分页查询接收类
	 * @return
	 */
	/*@RequestMapping("/getAppReview")
	public Map getAppReview(AppQuery a){
		
		
		System.out.println(a.getPageNo()+"--------------------appreview"+a.getPageSize());
	
	return appReviewService.getAppReview(a);
		
	}*/
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@RequestMapping("/getAppReview")
	public Map getAppInReview(AppQuery a){
		System.out.println(1111);
		return appReviewService.getAppInReview(a);
	}
}
