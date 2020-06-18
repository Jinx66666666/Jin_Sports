package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.mapper.IAppTiklMapper;
import com.xxx.proj.service.IAppTiklService;
@Service
@Transactional
public class AppTiklServiceImpl implements IAppTiklService{

	@Autowired
	private IAppTiklMapper appTiklMapper;

	/**
	 * 体育场，场馆查询
	 */
	@Override
	public List<Map> getAppTiklsport() {
		// TODO Auto-generated method stub
		List<Map> appTiklsport = appTiklMapper.getAppTiklsport();
		for (Map map : appTiklsport) {
			if (map.get("stadium").toString().equals("[null]")) {
				map.remove("stadium");
			}	
		}
		return appTiklsport;
	}



}
