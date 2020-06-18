package com.xxx.proj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Stadiumticket;
import com.xxx.proj.query.StadiumticketQuery;
import com.xxx.proj.service.IStadiumService;
import com.xxx.proj.service.IStadiumticketService;



/**
 * 场馆票务订单查看
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/stadiumticket")
public class StadiumticketController {

	@Autowired
	private IStadiumticketService stadiumticketService;
	
	@RequestMapping("/getStadiumticket")
	public Map getStadiumticket(@RequestBody StadiumticketQuery query){
		
		return stadiumticketService.getStadiumticket(query);
	}
	@RequestMapping("/getStadiumticketById")
	public Stadiumticket getStadiumticketById(int id){
		return stadiumticketService.getStadiumticketById(id);
		
	}
	@RequestMapping("/getSurface")
	public Map getSurface(){
		/*return stadiumticketService.getSurface();*/
		System.out.println("controll 接收到了");
		Map surface = stadiumticketService.getSurface();
		return surface;
		
		
		
	}
}
