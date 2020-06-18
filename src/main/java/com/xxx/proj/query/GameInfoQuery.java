package com.xxx.proj.query;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class GameInfoQuery extends BaseQuery {

	private String name;
	/*@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")*/
	private String applydate;
	
	private String cutdate;
	
	private String begindate;
	
	private String enddate;



	/*
	 * DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); Date
	 * applydate = format.parse(this.beginAndEnd[0]); Date cutdate =
	 * format.parse(this.beginAndEnd[1]);
	 * 
	 * setApplydate(applydate); setCutdate(cutdate);
	 */

}
