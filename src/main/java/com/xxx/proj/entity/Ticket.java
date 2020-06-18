package com.xxx.proj.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ticket { 

	private Integer id; 
	private Integer stadiumid;
	private Integer sportsid;
	private String ticketname;
	private String ticketprice;
	private String beginbusiness;
	private String endbusiness;
	private Integer ticketnumber;
	private String buynotice;
	private String ticketone;
	private String tickettwo;
	private String ticketthree;
	private String ticketfour;
	private String sportname;
	private String stadiumname;
	private int[] stadiumList;
	private int state;
}
  