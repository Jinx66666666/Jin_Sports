package com.xxx.proj.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.GoodReview;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.DynamicQuery;
import com.xxx.proj.query.ReviewQuery;
import com.xxx.proj.service.IDynamicService;
import com.xxx.proj.service.IReviewService;

@RestController
@RequestMapping("/dynamic")
public class DynamicController {
	
	@Autowired 
	private IDynamicService dynamicService;
	
	/**
	 * 获取所有最新动态信息
	 * @param query
	 * @return
	 */
	@RequestMapping("/getDynamic")
	public Map getReview(@RequestBody DynamicQuery query){
		return dynamicService.getDynamic(query);
	}
	/** 
	 * 添加最新动态信息
	 * @param d
	 * @return
	 */
	@RequestMapping("/addDynamic")
	public Result addReview(@RequestBody Dynamic d){
		 
		return dynamicService.addDynamic(d); 
	}
	/**
	 * 修改精彩回顾信息  
	 * @param d
	 * @return
	 */
	@RequestMapping("/editDynamic")
	public Result editReview(@RequestBody Dynamic d){
		return dynamicService.editDynamic(d);
	}
	/**
	 * 查询单个最新动态信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/getDynamicByID")
	public Dynamic getReviewByID(int id){ 
		return dynamicService.getDynamicByID(id);
		
	}
	/**
	 * 删除最新动态信息
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteDynamic")
	public Result deleteDynamic(@RequestBody int[] ids){
		System.out.println(ids);
		return dynamicService.deleteDynamic(ids);
		   
	}
	
	
}
