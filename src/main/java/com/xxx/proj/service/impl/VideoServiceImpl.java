package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Video;
import com.xxx.proj.mapper.IVideoMapper;
import com.xxx.proj.query.JinTeamQuery;
import com.xxx.proj.service.IVideoService;

/**
 *@className:VideoServiceImpl.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月5日上午11:12:17
*/
@Service
public class VideoServiceImpl implements IVideoService{
	
	@Autowired
	private IVideoMapper mapper;
	@Override
	public Map getVideo(JinTeamQuery query) {
		List<Map> videoData = mapper.getVideo(query);
		Integer videoTotal = mapper.getVideoTotal(query);
		Map map = new HashMap<>();		
		map.put("videoData", videoData);
		map.put("videoTotal", videoTotal);
		return map;
	}
	@Override
	public Result addVideo(Video v) {
		mapper.AddVideo(v);
		return new Result(200,"添加成功");
	}
	@Override
	public Video getEditVideo(int id) {
		
		return mapper.getEditVideo(id);
	}
	@Override
	public Result editVideo(Video v) {
		mapper.editVideo(v);
		return new Result(200,"添加成功");
	}
	
	@Override
	public Result deleteVideo(int[] ids) {
		mapper.deleteVideo(ids);
		return new Result(200,"添加成功");
	}
	
}
