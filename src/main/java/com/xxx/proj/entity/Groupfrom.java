package com.xxx.proj.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Groupfrom {
	private Integer id;

	private Integer gameinid;

	private Integer groupid;

	private Integer number;
	private String value;
	private String key;

}