package com.xxx.proj.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class SportsQuery extends BaseQuery {
	
	private String sportname;
	private String sportaddress;
}
