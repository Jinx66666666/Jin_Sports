package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;
import com.xxx.proj.entity.JinTeamInfo;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.JinTeamQuery;
/**
 *@className:JinController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月3日上午9:59:19
*/
public interface IJinTeamInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JinTeamInfo record);

    int insertSelective(JinTeamInfo record);

    JinTeamInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JinTeamInfo record);

    int updateByPrimaryKey(JinTeamInfo record);

	List<Map> getTeamInfo(JinTeamQuery query);

	Integer getTotal(JinTeamQuery query);

	List<Map> getGamename();

	List<Map> getGroupname();

	JinTeamInfo getEditTeam(int id);

	void addEmp(JinTeamInfo j);

	void edidTeam(JinTeamInfo j);

	void deleteTeam(int[] ids);

	List<Map> gameList();
}