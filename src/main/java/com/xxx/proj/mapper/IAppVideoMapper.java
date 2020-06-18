package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.query.AppQuery;

public interface IAppVideoMapper {
	/**
	 * 查询所有的直播
	 * 
	 * @return
	 */
	List<Map> getVideo(AppQuery appQuery);
	
	/**
	 * 查询数量
	 * @return
	 */
	int  getCount();

}
