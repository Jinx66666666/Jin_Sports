package com.xxx.proj.query;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class UserQuery extends BaseQuery{
	
	private String name;
	private String tel;
	private String beginDate;
	private String endDate;
}
