package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.SportAdd;
import com.xxx.proj.query.SportsQuery;

public interface ISportMapper {
	List<Map> getSport(SportsQuery query);
	
	Integer getTotal(SportsQuery query);

	int addSports(SportAdd s);

	int editSports(SportAdd s);

	SportAdd getSportById(int id);

	void deleteSport(int[] ids);

	Integer selectByName(String sportname);
}
