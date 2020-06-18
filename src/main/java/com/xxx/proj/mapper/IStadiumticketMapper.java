package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Stadiumticket;
import com.xxx.proj.query.StadiumticketQuery;

public interface IStadiumticketMapper {

	List<Map> getStadiumticket(StadiumticketQuery query);

	Integer getTotal(StadiumticketQuery query);

	Stadiumticket getStadiumticketById(int id);
	
	List<Map> getSurface();
}
