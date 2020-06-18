package com.xxx.proj.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.JinTeamInfo;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.JinTeamQuery;
import com.xxx.proj.service.IJinService;

/**
 *@className:JinController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月3日上午9:59:19
*/
@RestController
@RequestMapping("/jin")
public class JinController {
	
	@Autowired
	private IJinService service;
	
	/**
	 * 分页和搜索组类别名称和队伍名称
	 * @param query
	 * @return
	 */
	@RequestMapping("/getTeamInfo")
	public Map getTeamInfo(@RequestBody JinTeamQuery query){

		return service.getTeamInfo(query);
	}
	/**
	 *  获取赛事名称
	 * @return
	 */
	@RequestMapping("/getGamename")
	public List<Map> getGamename(){
		return service.getGamename();		
	}
	/**
	 * 获取组类别名称
	 * @return
	 */
	@RequestMapping("/getGroupname")
	public List<Map> getGroupname(){
		return service.getGroupname();		
	}
	/**
	 * 点击编辑加载数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/getEditTeam")
	public JinTeamInfo getEditTeam(int id){		
		
		return service.getEditTeam(id);		
	}
	/**
	 * 赛事组别添加
	 * @param e
	 * @return
	 */
	@RequestMapping("/addTeam")
	public Result addEmp(@RequestBody JinTeamInfo j){
	
		return service.addEmp(j);		
	}
	/**
	 * 编辑赛事组别
	 * @param j
	 * @return
	 */
	@RequestMapping("/edidTeam")
	public Result edidTeam(@RequestBody JinTeamInfo j){
		return service.edidTeam(j);		
	}
	/**
	 * 删除选中行信息
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteTeam")
	public Result deleteTeam(@RequestBody int[] ids){		
		
		return service.deleteTeam(ids);
	}
	/**
	 * 赛事组别二级联动
	 * 
	 */
	@RequestMapping("/gameList")
	public List<Map> gameList (){
		
		return service.gameList();
		
	}
	
}
