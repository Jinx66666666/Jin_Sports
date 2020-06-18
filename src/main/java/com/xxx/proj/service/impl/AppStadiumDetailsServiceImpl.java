package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Stadium;
import com.xxx.proj.mapper.IAppStadiumDetailsMapper;
import com.xxx.proj.service.IAppStadiumDetailsService;
@Service
@Transactional
public class AppStadiumDetailsServiceImpl implements IAppStadiumDetailsService{

	@Autowired
	private IAppStadiumDetailsMapper appMapper;
	@Override
	public Map getStadiumDetails(Integer id) {
		// TODO Auto-generated method stub
		
		/*for (Map map : stadiumDetails) {
			if (map.get("stadium").toString().equals("[null]")) {
				map.remove("stadium");
			}	
		}*/
		return appMapper.getStadiumDetails(id);
	}

}
