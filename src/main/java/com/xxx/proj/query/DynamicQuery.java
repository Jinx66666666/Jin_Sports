package com.xxx.proj.query;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class DynamicQuery extends BaseQuery{
	
	private String dynamictitle;
	private String dynamicintro;
}
