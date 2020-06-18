package com.xxx.proj.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class BaseQuery {
	private int page;
	private int count;
	public int getPage() {
		return (page-1)*count;
	}
}
