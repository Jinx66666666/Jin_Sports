package com.xxx.proj.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Stadiumticket;
import com.xxx.proj.mapper.IStadiumticketMapper;
import com.xxx.proj.query.StadiumticketQuery;
import com.xxx.proj.service.IStadiumticketService;

@Service
@Transactional
public class StadiumticketServiceImpl implements IStadiumticketService {

	@Autowired
	private IStadiumticketMapper stadiumticketMapper;

	@Override
	public Map getStadiumticket(StadiumticketQuery query) {
		List<Map> getstadiumticket = stadiumticketMapper.getStadiumticket(query);
		Integer gettotal = stadiumticketMapper.getTotal(query);
		Map map = new HashMap();
		map.put("getstadiumticket", getstadiumticket);
		map.put("gettotal", gettotal);
		return map;
	}

	@Override
	public Stadiumticket getStadiumticketById(int id) {
		// TODO Auto-generated method stub
		return stadiumticketMapper.getStadiumticketById(id);
	}

	@Override
	public Map getSurface() {
		System.out.println("service ++++++");
		List<Map> list = stadiumticketMapper.getSurface();
		ArrayList number = new ArrayList();
		ArrayList sName = new ArrayList();
		for (Map map : list) {

			number.add(map.get("number"));
			sName.add(map.get("stadiumname"));
		}
		System.out.println("--------");

		Map map = new HashMap();

		map.put("sName", sName);
		map.put("number", number);
		return map;

	};
}
