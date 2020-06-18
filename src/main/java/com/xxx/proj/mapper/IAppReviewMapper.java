package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.query.AppQuery;

public interface IAppReviewMapper {

	List<Map> getAppInReview(AppQuery a);
	
	Integer getTotal(AppQuery a);
}
