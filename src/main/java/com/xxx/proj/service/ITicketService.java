package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Ticket;
import com.xxx.proj.query.DynamicQuery;
import com.xxx.proj.query.TicketQuery;

public interface ITicketService {
	
	/**
	 * 分页+搜索  票务信息
	 * @param query
	 * @return
	 */
	Map getTicket(TicketQuery query);

	
	
	/**
	 * 添加票务信息
	 * @param d
	 * @return
	 */
	Result addTicket(Ticket d);

	/**
	 * 修改票务信息
	 * @param d
	 * @return
	 */
	Result editTicket(Ticket d);
	/**
	 * 根据该行id查询票务信息
	 * @param id
	 * @return
	 */
	Ticket getTicketByID(int id);

	/**
	 * 根据id批量删除票务
	 * @param ids
	 * @return
	 */
	Result deleteTicket(int[] ids);


	/**
	 * 获取体育场馆信息
	 * @param ids
	 * @return
	 */
	List<Map> getSaiShiTiYu();
	


	



	



	

	





}
