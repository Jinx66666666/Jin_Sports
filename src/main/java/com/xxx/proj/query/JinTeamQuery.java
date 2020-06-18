package com.xxx.proj.query;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
public class JinTeamQuery extends BaseQuery{
	private String groupname;
	private String gname;
	private String teamname;
	private String videotitle;
	private String begintime;
	private String endtime;
}
