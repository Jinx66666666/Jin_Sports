package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.proj.mapper.IAppVideoMapper;
import com.xxx.proj.query.AppQuery;
import com.xxx.proj.service.IAppVideoService;

@Service
public class AppVideoServiceImpl implements IAppVideoService {

	@Autowired
	private IAppVideoMapper mapper;

	/**
	 * 条件查询视频，查询总数量
	 */
	@Override
	public Map<Object, Object> getVideo(AppQuery appQuery) {
		List<Map> list = mapper.getVideo(appQuery);
		int count = mapper.getCount();
		Map<Object,Object> map = new HashMap<>();
		map.put("list", list);
		map.put("count", count);
		
	
		return map;
	}

}
