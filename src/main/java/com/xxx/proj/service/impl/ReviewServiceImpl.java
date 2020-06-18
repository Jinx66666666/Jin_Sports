package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.GoodReview;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.IReviewMapper;
import com.xxx.proj.query.ReviewQuery;
import com.xxx.proj.service.IReviewService;
@Service
@Transactional
public class ReviewServiceImpl implements IReviewService{

	@Autowired
	private IReviewMapper reviewMapper;
	

	/**
	 * 查询精彩回顾列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map getReview(ReviewQuery query) {
		
		List<GoodReview> getreview = reviewMapper.getReview(query);
		Integer gettotal = reviewMapper.getTotal(query);
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("getreview", getreview);
		map.put("gettotal", gettotal);
		return map;
		
	}
	/** 
	 * 添加精彩回顾
	 */
	@Override
	public Result addReview(GoodReview e) {
		reviewMapper.addReview(e);
		
		return new Result(200, "添加成功");
	}

	/**
	 * 编辑精彩回顾
	 */
	@Override
	public Result editReview(GoodReview e) {
		reviewMapper.editReview(e);
		return new Result(200, "修改成功");
	}
	/**
	 * 点击编辑时查询出该精彩回顾信息
	 */
	@Override
	public GoodReview getReviewByID(int id) {
		
		return reviewMapper.getReviewByID(id);
	}
	/**
	 * 批量删除精彩回顾
	 */
	@Override
	public Result deleteReview(int[] ids) {
		reviewMapper.deleteReview(ids);
		return new Result(200,"删除成功");
	}
	
	

}
