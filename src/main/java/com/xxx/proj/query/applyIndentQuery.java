package com.xxx.proj.query;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class applyIndentQuery extends BaseQuery{
	private String beginDate;
	private String endDate;
	private String paystate;
}
