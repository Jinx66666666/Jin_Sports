package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.GoodReview;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.ReviewQuery;

public interface IReviewService {
	
	/**
	 * 分页+搜索  精彩回顾信息
	 * @param query
	 * @return
	 */
	Map getReview(ReviewQuery query);

	
	
	/**
	 * 添加精彩回顾信息
	 * @param g
	 * @return
	 */
	Result addReview(GoodReview g);

	/**
	 * 修改精彩回顾信息
	 * @param g
	 * @return
	 */
	Result editReview(GoodReview g);
	/**
	 * 根据该行id查询精彩回顾信息
	 * @param id
	 * @return
	 */
	GoodReview getReviewByID(int id);

	/**
	 * 根据id批量删除精彩回顾
	 * @param ids
	 * @return
	 */
	Result deleteReview(int[] ids);
	


	



	



	

	





}
