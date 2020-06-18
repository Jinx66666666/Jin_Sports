package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;


public interface IAppStadiumDetailsMapper {

	Map getStadiumDetails(Integer id);
	
	List<Map> getAppDetails();
}
