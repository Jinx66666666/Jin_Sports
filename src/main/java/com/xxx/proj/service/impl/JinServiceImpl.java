package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.xxx.proj.entity.JinTeamInfo;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.IJinTeamInfoMapper;
import com.xxx.proj.query.JinTeamQuery;
import com.xxx.proj.service.IJinService;

/**
 *@className:JinController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月3日上午9:59:19
*/

@Service
@Transactional
public class JinServiceImpl implements IJinService{
	
	@Autowired
	private IJinTeamInfoMapper infoMapper;
	/**
	 * 分页和搜索组类别名称和队伍名称
	 * @param query
	 * @return
	 */
	@Override
	public Map getTeamInfo(JinTeamQuery query) {
		List<Map> teamDate = infoMapper.getTeamInfo(query);
		Integer teamTotal = infoMapper.getTotal(query);
		Map map = new HashMap();
		map.put("teamDate", teamDate);
		map.put("teamTotal", teamTotal);
		return map;
	}
	/**
	 *  获取赛事名称
	 * @return
	 */
	@Override
	public List<Map> getGamename() {
		
		return infoMapper.getGamename();
	}
	/**
	 * 获取组类别名称
	 * @return
	 */
	@Override
	public List<Map> getGroupname() {
		
		return infoMapper.getGroupname();
	}
	/**
	 * 点击编辑加载数据
	 * @param id
	 * @return
	 */
	@Override
	public JinTeamInfo getEditTeam(int id) {
		JinTeamInfo editTeam = infoMapper.getEditTeam(id);
		if (editTeam.getGroupname()==null) {
			int[] arr = {Integer.parseInt(editTeam.getGamename())};
			editTeam.setGameList(arr);
		}else{
			int[] arr = {Integer.parseInt(editTeam.getGamename()),Integer.parseInt(editTeam.getGroupname())};
			editTeam.setGameList(arr);		
		}
		return editTeam;
	}
	/**
	 * 赛事组别添加
	 * @param e
	 * @return
	 */
	@Override
	public Result addEmp(JinTeamInfo j) {
		int[] list = j.getGameList();
		if(list.length != 0){
			int x = 1;
			for(int i : list){
				if(x==1){
					j.setGamename(i+"");
				}else{
					j.setGroupname(i+"");
				}
				x++;
			}
			
		}
		infoMapper.addEmp(j);
		return new Result(200,"添加成功");
	}
	/**
	 * 赛事报名参赛组信息
	 * @param e
	 * @return
	 */
	@Override
	public Result edidTeam(JinTeamInfo j) {
		// HTML传的赛事是数组，遍历一下
		int[] gameList = j.getGameList();
		int x = 1;
		for (int i : gameList) {
			if (x == 1) {							
			j.setGamename(String.valueOf(i));
		}else{
			j.setGroupname(String.valueOf(i));
		}
			x++;
		}
		infoMapper.edidTeam(j);
		
		return new Result(200,"修改成功");
	}
	/**
	 * 删除选中行信息
	 */
	@Override
	public Result deleteTeam(int[] ids) {
		infoMapper.deleteTeam(ids);
		return new Result(200, "删除成功");
	}
	/**
	 * 赛事组别二级联动
	 */
	@Override
	public List<Map> gameList() {
		List<Map> list = infoMapper.gameList();
		for (Map map : list) {
			if (map.get("children").toString().equals("[null]")) {
				map.remove("children");
			}

		}
		
		return list;
	}

}
