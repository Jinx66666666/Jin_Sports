package com.xxx.proj.entity;




import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserPeople {

	private Integer id;
	private String name;
	private String tel;
	private String password; 
	private String head;
	private Date registerdate;
}
  