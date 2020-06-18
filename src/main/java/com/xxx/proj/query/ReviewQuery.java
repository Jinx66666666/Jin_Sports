package com.xxx.proj.query;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class ReviewQuery extends BaseQuery{
	
	private String reviewtitle;
	private String reviewintro;
}
