package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.query.AppQuery;

public interface IAppVideoService {

	/**
	 * 查询所有的直播
	 * 
	 * @return
	 */
	Map<Object, Object> getVideo(AppQuery appQuery);

}
