package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Stadium;
import com.xxx.proj.query.StadiumQuery;

public interface IStadiumMapper {
	List<Map> getStadium(StadiumQuery query);

	Integer getTotal(StadiumQuery query);

	List<Map> getSport();

	int addStadium(Stadium s);

	int editStadium(Stadium s);

	Stadium getStadiumById(int id);

	void deleteStadium(int[] ids);

	Integer selectByName(String stadiumname);
}
