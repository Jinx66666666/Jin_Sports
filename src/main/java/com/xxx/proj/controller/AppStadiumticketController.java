package com.xxx.proj.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.OrderLook;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Stadiumticket;
import com.xxx.proj.service.IAppStadiumticketService;

@RestController
@RequestMapping("/appStadiumticket")
public class AppStadiumticketController {
	@Autowired
	private IAppStadiumticketService service;
	/** 
	 * App端添加场馆票务预定
	 */
	@RequestMapping("/editStadiumticket")
	public String editStadiumticket(Stadiumticket s) {

		return service.editStadiumticket(s);
	}

	/**
	 * 添加核销码
	 * @param o
	 * @return
	 */
	@RequestMapping("/editorderlook")
	public Map editorderlook(@RequestBody OrderLook o){
		return service.editorderlook(o);
		
	}
}
