package com.xxx.proj.service;


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
public interface IJinService {
	/**
	 * 分页和搜索组类别名称和队伍名称
	 * @param query
	 * @return
	 */
	Map getTeamInfo(JinTeamQuery query);
	/**
	 *  获取赛事名称
	 * @return
	 */
	List<Map> getGamename();
	/**
	 * 获取组类别名称
	 * @return
	 */
	List<Map> getGroupname();
	/**
	 * 点击编辑加载数据
	 * @param id
	 * @return
	 */
	JinTeamInfo getEditTeam(int id);
	/**
	 * 赛事报名参赛组信息
	 * @param e
	 * @return
	 */
	Result addEmp(JinTeamInfo j);
	/**
	 * 编辑当前行信息
	 * @param j
	 * @return
	 */
	Result edidTeam(JinTeamInfo j);
	/**
	 * 删除选中行信息
	 * @param ids
	 * @return
	 */
	Result deleteTeam(int[] ids);
	/**
	 * 赛事组别二级联动
	 * @return
	 */
	List<Map> gameList();
	
}
