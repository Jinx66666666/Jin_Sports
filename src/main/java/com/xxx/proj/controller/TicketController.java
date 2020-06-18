package com.xxx.proj.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.GoodReview;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Ticket;
import com.xxx.proj.query.DynamicQuery;
import com.xxx.proj.query.ReviewQuery;
import com.xxx.proj.query.TicketQuery;
import com.xxx.proj.service.IDynamicService;
import com.xxx.proj.service.IReviewService;
import com.xxx.proj.service.ITicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired 
	private ITicketService ticketService;
	
	/** 
	 * 获取所有最新票务信息
	 * @param query 
	 * @return
	 */
	@RequestMapping("/getTicket")
	public Map getTicket(@RequestBody TicketQuery query){
		return ticketService.getTicket(query);
	}
	/** 
	 * 获取票务信息
	 * @param query 
	 * @return
	 */
	@RequestMapping("/getSaiShiTiYu")
	public List<Map> getSaiShiTiYu(){
		return ticketService.getSaiShiTiYu();
	}
	/** 
	 * 添加最新票务信息
	 * @param d
	 * @return
	 */
	@RequestMapping("/addTicket")
	public Result addTicket(@RequestBody Ticket d){
		 
		return ticketService.addTicket(d); 
	}
	/**
	 * 修改票务信息  
	 * @param d
	 * @return
	 */
	@RequestMapping("/editTicket")
	public Result editTicket(@RequestBody Ticket d){
		/*System.out.println(d.getState());*/
		return ticketService.editTicket(d);
	}
	/**
	 * 查询单个票务信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/getTicketByID")
	public Ticket getTicketByID(int id){ 
		return ticketService.getTicketByID(id);
		
	}
	/**
	 * 删除票务信息
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteTicket")
	public Result deleteTicket(@RequestBody int[] ids){
		return ticketService.deleteTicket(ids);
		   
	}
	
	
}
