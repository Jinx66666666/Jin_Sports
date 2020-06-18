package com.xxx.proj.mapper;

import java.util.List;

import com.xxx.proj.entity.GoodReview;
import com.xxx.proj.query.ReviewQuery;

public interface IReviewMapper {
	


	List<GoodReview> getReview(ReviewQuery query);

	Integer getTotal(ReviewQuery query);

	void addReview(GoodReview e);

	void editReview(GoodReview e);

	GoodReview getReviewByID(int id);

	void deleteReview(int[] ids);



}
