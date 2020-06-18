package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.SportAdd;
import com.xxx.proj.entity.Stadium;
import com.xxx.proj.mapper.IStadiumMapper;
import com.xxx.proj.query.StadiumQuery;
import com.xxx.proj.service.IStadiumService;
@Service
@Transactional
public class StadiumServiceImpl implements IStadiumService{
	@Autowired
	private IStadiumMapper stadiumMapper;
	@Override
	public Map getStadium(StadiumQuery query) {
		List<Map> getstadium = stadiumMapper.getStadium(query);
		Integer gettotal = stadiumMapper.getTotal(query);
		Map map = new HashMap();
		map.put("getstadium", getstadium);
		map.put("gettotal", gettotal);
		return map;
	}
	@Override
	public List<Map> getSport() {
		// TODO Auto-generated method stub
		return stadiumMapper.getSport();
	}
	@Override
	public Result addStadium(Stadium s) {
		Integer intName = stadiumMapper.selectByName(s.getStadiumname()); // 查询名字是否已存在
		if (intName != 0) {
			return new Result(300, "场馆名称不能相同");
		}
		int add = stadiumMapper.addStadium(s);
		if (add != 1) {
			return new Result(400, "添加失败");
		}
		return new Result(200, "添加成功");
	}
	@Override
	public Result editStadium(Stadium s) {
		int edit = stadiumMapper.editStadium(s);
		if (edit != 1) {
			return new Result(400, "添加失败");
		}
		return new Result(200, "添加成功");
	}
	@Override
	public Stadium getStadiumById(int id) {
		
		return stadiumMapper.getStadiumById(id);
	}
	@Override
	public Result deleteStadium(int[] ids) {
		stadiumMapper.deleteStadium(ids);
		return new Result(200,"删除成功");
	}

}
