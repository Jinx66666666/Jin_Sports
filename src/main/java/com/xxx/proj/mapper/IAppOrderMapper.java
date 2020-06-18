package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xxx.proj.entity.JinApplyIndent;

public interface IAppOrderMapper {
	 
	List<JinApplyIndent> getOrder(@Param("tel") String tel,@Param("paystate") String paystate);

	List<Map> getTicketOrder(String tel);
}
