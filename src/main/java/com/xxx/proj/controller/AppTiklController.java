package com.xxx.proj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.service.IAppTiklService;

@RestController
@RequestMapping("/appTikl")
public class AppTiklController {

		@Autowired
		private IAppTiklService appTiklService;
		
		/*@RequestMapping("/getAppTikl")
		public Map getAppTikl(Integer id){
			return appTiklService.getAppTikl(id);
			
		}*/
		
		/**
		 * 查询前端场馆租凭需要的数据
		 * @param s
		 * @return
		 */
		@RequestMapping("/getAppTiklsport")
		public List<Map> getAppTiklsport(){
			System.out.println("-------");
			System.out.println(appTiklService.getAppTiklsport());
			return appTiklService.getAppTiklsport();
		}
}
