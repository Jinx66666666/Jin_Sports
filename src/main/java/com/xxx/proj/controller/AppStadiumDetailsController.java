package com.xxx.proj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Stadium;
import com.xxx.proj.service.IAppStadiumDetailsService;

@RestController
@RequestMapping("/appStadiumDetails")
public class AppStadiumDetailsController {
@Autowired
private IAppStadiumDetailsService appService;
/**
 * 查询场馆项目的详细信息
 * @param id
 * @return
 */
@RequestMapping("/getStadiumDetails")
public Map getStadiumDetails(Integer id){
	return appService.getStadiumDetails(id);
	
}
}
