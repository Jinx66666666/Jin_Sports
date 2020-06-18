package com.xxx.proj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderLook {
	
	private Object id;
	
	private Object ordernum;
	
	private Object code;
	
	private Object state;
	
	private Object name;
}
