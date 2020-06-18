package com.xxx.proj.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Stadiumticket {

		private Integer id;
		
		private String ordernum;
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
		private Date orderdate;
		
		private String price;
		
		private String state;
		
		private String paymenttype;
		
		private Integer ticketid;
		
		private String loginid;
		
		private Integer number;
}
