package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.JinTeamInfo;

/**
 *@className:IIndexMapper.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月15日上午11:59:39
*/
public interface IAppIndexMapper {

	List<Map> getGame();

	List<Map> getGameInfo(Gameinformation g);

	List<Map> getContent(Gameinformation g);

	List<Map> getGroup(Gameinformation g);

	int selectGamename(String gamename);

	int selectGname(String grouping);

	void addOrder(JinApplyIndent j);


	List<Map> getNews(Dynamic c);


	int updateState(String jin);
	
	int updateTicketState(String jin);

	Integer selectGamenames(String gamename);

	Integer selectGnames(String groupname);

	int addTeam(JinTeamInfo j);

	int selectCon(JinApplyIndent j);

	int selectTeam(JinTeamInfo j);

	/*List<Map> selectRecord();*/

}
