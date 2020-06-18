package com.xxx.proj.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.GoodReview;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.ReviewQuery;
import com.xxx.proj.service.IReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired 
	private IReviewService reviewService;
	
	/**
	 * 获取所有精彩回顾信息
	 * @param query
	 * @return
	 */
	@RequestMapping("/getReview")
	public Map getReview(@RequestBody ReviewQuery query){
		return reviewService.getReview(query);
	}
	/**
	 * 添加精彩回顾信息
	 * @param g
	 * @return
	 */
	@RequestMapping("/addReview")
	public Result addReview(@RequestBody GoodReview g){
		 
		return reviewService.addReview(g); 
	}
	/**
	 * 修改精彩回顾信息  
	 * @param g
	 * @return
	 */
	@RequestMapping("/editReview")
	public Result editReview(@RequestBody GoodReview g){
		return reviewService.editReview(g);
	}
	/**
	 * 查询单个精彩回顾信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/getReviewByID")
	public GoodReview getReviewByID(int id){ 
		return reviewService.getReviewByID(id);
		
	}
	/**
	 * 删除精彩回顾信息
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteReview")
	public Result deleteReview(@RequestBody int[] ids){
		return reviewService.deleteReview(ids);
		   
	}
	
	
}
