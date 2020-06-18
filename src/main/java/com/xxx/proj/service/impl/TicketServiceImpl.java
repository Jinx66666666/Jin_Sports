package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Ticket;
import com.xxx.proj.mapper.IDynamicMapper;
import com.xxx.proj.mapper.ITicketMapper;
import com.xxx.proj.query.DynamicQuery;
import com.xxx.proj.query.TicketQuery;
import com.xxx.proj.service.IDynamicService;
import com.xxx.proj.service.ITicketService;
@Service
@Transactional
public class TicketServiceImpl implements ITicketService{

	@Autowired
	private ITicketMapper ticketMapper;
	

	/**
	 * 查询最新动态列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map getTicket(TicketQuery query) {
		
		List<Ticket> getticket = ticketMapper.getTicket(query);
		Integer gettotal = ticketMapper.getTotal(query);
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("getdynamic", getticket);
		map.put("gettotal", gettotal);
		return map;
		
	}
	/** 
	 * 添加最新动态
	 */ 
	@Override
	public Result addTicket(Ticket e) {
		int[] stadiumList = e.getStadiumList();
		int x = 1;
		for (int i : stadiumList) {
			if (x == 1) {
				e.setSportsid(i);;
			} else { 
				e.setStadiumid(i);;
			}
			x++;
		}
		
		int a = ticketMapper.addTicket(e);
		if(a!=1){
			return new Result(400, "添加失败");
		}
		return new Result(200, "添加成功");
	}

	/**
	 * 编辑最新动态
	 */
	@Override
	public Result editTicket(Ticket e) {
		int[] stadiumList = e.getStadiumList();
		int x = 1;
		for (int i : stadiumList) {
			if (x == 1) {
				e.setSportsid(i);;
			} else { 
				e.setStadiumid(i);;
			}
			x++;
		}
		int i = ticketMapper.editTicket(e);
		if(i!=1){
			return new Result(400, "修改失败");
		}
		return new Result(200, "修改成功");
	}
	/**
	 * 点击编辑时查询出该最新动态信息
	 */
	@Override
	public Ticket getTicketByID(int id) {
		Ticket ticket = ticketMapper.getTicketByID(id);
		if(ticket.getStadiumid()!=null){
		Integer sportid = ticket.getSportsid();
		Integer stadiumid = ticket.getStadiumid();
		int[] stadiumList = {sportid,stadiumid};
		ticket.setStadiumList(stadiumList);
		return ticket; 
		}else{
		Integer sportid = ticket.getSportsid();
		int[] stadiumList = {sportid};
		ticket.setStadiumList(stadiumList);
		return ticket; 
		}
	}
	/**
	 * 批量删除最新动态
	 */
	@Override
	public Result deleteTicket(int[] ids) {
		ticketMapper.deleteTicket(ids);
		return new Result(200,"删除成功");
	}
	/**
	 * 获取体育场馆信息
	 */
	@Override
	public List<Map> getSaiShiTiYu() {
		List<Map> saiShiTiYu = ticketMapper.getSaiShiTiYu();
		for (Map map : saiShiTiYu) {
			if (map.get("children").toString().equals("[null]")) {
				map.remove("children");
			}
		}
		return saiShiTiYu;
	}
	
	

}
