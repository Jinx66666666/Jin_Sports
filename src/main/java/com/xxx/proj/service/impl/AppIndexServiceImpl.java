package com.xxx.proj.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.JinTeamInfo;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.IAppIndexMapper;
import com.xxx.proj.service.IAppIndexService;
import com.xxx.proj.util.CodeSessionUtil;
import com.xxx.proj.util.UserUtil;

/**
 *@className:IndexService.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月15日上午11:58:42
*/
@Service
public class AppIndexServiceImpl implements IAppIndexService{
	
	@Autowired 
	private IAppIndexMapper mapper;
	/**
	 * 获取app首页赛事信息
	 */
	@Override
	public Map getGame() {
		List<Map> game = mapper.getGame();
		Map map = new HashMap<>();
		map.put("game", game);
		return map;
	}
	/**
	 * 根据赛事获取赛事详情
	 */
	@Override
	public Map getGameInfo(Gameinformation g) {
		List<Map> gameInfo = mapper.getGameInfo(g);
		Map map = new HashMap<>();
		map.put("gameInfo", gameInfo);
		return map;
	}
	/**
	 * 根据赛事名称查询免责声明
	 */
	@Override
	public Map getContent(Gameinformation g) {
		List<Map> contentInfo = mapper.getContent(g);
		Map map = new HashMap<>();
		map.put("contentInfo", contentInfo);
		return map;
	}
	/**
	 * 根据赛事获取组别信息
	 */
	@Override
	public Map getGroup(Gameinformation g) {
		List<Map> groupInfo = mapper.getGroup(g);
		Map map = new HashMap<>();
		map.put("groupInfo", groupInfo);
		return map;
	}
	/**
	 * 手机App获取订单信息保存数据库
	 */
	@Override
	public String addOrder(JinApplyIndent j) {
				
		System.out.println("----------"+UserUtil.getUserPeople().getTel());
				
		//获取session登录信息手机号
		j.setUsetel(UserUtil.getUserPeople().getTel());
		//获取赛事表id
		int nid = mapper.selectGamename(j.getGamename());
									
		j.setGamenames(String.valueOf(nid));
		
		//获取组别表id
		int gid = mapper.selectGname(j.getGname());
		
		j.setGrouping(String.valueOf(gid));
		//获取组别费用
		j.setJinx(j.getCost());
		
		//查询数量
		if(mapper.selectCon(j) >= 1){
			return "500";
		}
		
		//查询记录
		/*mapper.selectRecord();
		System.out.println("____________________________");
		System.out.println(mapper.selectRecord());*/
		
		//获取当前时间年月日时分秒，并转换成字符串，作为订单号
		Date date=new Date(); 
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss"); 
		String time=formatter.format(date);
		j.setJin(time);
		
		j.setApplydate(date);
		
		j.setPaystate("未支付");
		
		mapper.addOrder(j);
		return time;
	}

	/**
	 * 获取最新动态
	 */
	@Override
	public Map getNews(Dynamic c) {
		List<Map> newInfo = mapper.getNews(c);
		Map map = new HashMap<>();
		map.put("newInfo", newInfo);
		return map;
	}
	/**
	 * 支付成功后更新订单状态
	 */
	@Override
	public Result updateState(String jin) {
		int i = mapper.updateState(jin);
		int j = mapper.updateTicketState(jin);//预定场馆支付后修改状态
		if (j!=0) {
			return new Result(200, "修改成功");
		}
		if (i!=0) {
			return new Result(200, "修改成功");
		}
		return new Result(400, "修改失败");
	}
	/**
	 * 团队信息添加
	 */
	@Override
	public Result addTeam(JinTeamInfo j) {
		
		Integer nid = mapper.selectGamenames(j.getGamename());		
		//判断是否有赛事
		if(nid == null){
			return new Result(501,"对不起！当前无此赛事。");
		}		
		j.setGamename(String.valueOf(nid));
		
		//判断是否有组别
		Integer gid = mapper.selectGnames(j.getGroupname());
		if(gid == null){
			return new Result(502,"对不起！当前无此组别。");
		}
		j.setGroupname(String.valueOf(gid));
		/*int i = mapper.addTeam(j);*/
		
		//判断是否有记录
		if(mapper.selectTeam(j) >=1){
			
			return new Result(500,"sorry!不能重复组建战队");
		}else{
			int i = mapper.addTeam(j);
			if (i!=0) {
				return new Result(200, "战队组建成功");
			}
			return new Result(400, "对不起，信息有误，战队组建失败");
		}
		
	}

	
	
}
