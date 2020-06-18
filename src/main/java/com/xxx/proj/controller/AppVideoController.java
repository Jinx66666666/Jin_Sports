package com.xxx.proj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.query.AppQuery;
import com.xxx.proj.service.IAppVideoService;

@RestController
@RequestMapping("/appVideo")
public class AppVideoController {

	@Autowired
	private IAppVideoService service;

	/**
	 * 添加查询，  以及 查询数量
	 *
	 * @param appQuery
	 * @return
	 */
	@RequestMapping("getVideo") 
	public Map getVideo(AppQuery appQuery) {
		System.out.println(appQuery.getPageNo()+"-------"+appQuery.getPageSize());
	
		 Map<Object, Object> map = service.getVideo(appQuery);
		return map;
	}
}
