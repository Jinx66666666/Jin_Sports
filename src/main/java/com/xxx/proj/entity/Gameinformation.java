package com.xxx.proj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Gameinformation {
	private Integer id;

	private String gamename;

	private Integer sumpeople;

	private Integer disclaimerid;
/*	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")*/
	private Date applydate;
	
	private String paystate;
	
	private Date cutdate;

	private Date begindate;
	
	private Date enddate;

	private String groupfrom;

	private Integer groupid;

	private Integer stadiumid;

	private Integer state;

	private String picture;

	private Integer sportid;

	private String manipuler;

	private String introduce;
	private int[] stadiumList;
	private List<Groupfrom> domains;


}