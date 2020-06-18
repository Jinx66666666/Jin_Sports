package com.xxx.proj.query;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class JinApplyQuery extends BaseQuery{
	private String gamename;
	private String applydate;	
	private String applyname;	
}
