package com.xxx.proj.query;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class TicketQuery extends BaseQuery{
	
	private String sportname;
	private String stadiumname;
}
