package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Ticket;
import com.xxx.proj.query.DynamicQuery;
import com.xxx.proj.query.TicketQuery;

public interface ITicketMapper {
	

	List<Map> getSaiShiTiYu();
	List<Ticket> getTicket(TicketQuery query);

	Integer getTotal(TicketQuery query);

	int addTicket(Ticket e);

	int editTicket(Ticket e);

	Ticket getTicketByID(int id);

	int deleteTicket(int[] ids);



}
