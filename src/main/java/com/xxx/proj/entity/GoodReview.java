package com.xxx.proj.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GoodReview { 

	private Integer id;
	private String reviewtitle;
	private String reviewdetailedinfo;
	private int state; 
	private String reviewintro;
}
  