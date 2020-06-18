package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.JinTeamInfo;
import com.xxx.proj.entity.Result;

/**
 *@className:IIndexService.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月15日上午11:58:21
*/
public interface IAppIndexService {
	/**
	 * 获取App首页赛事信息
	 * @return
	 */
	Map getGame();

	Map getGameInfo(Gameinformation g);

	Map getContent(Gameinformation g);

	Map getGroup(Gameinformation g);

	String addOrder(JinApplyIndent j);
	
	Result updateState(String jin);

	Map getNews(Dynamic c);

	Result addTeam(JinTeamInfo j);

}
