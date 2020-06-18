package com.xxx.proj.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.IJinApplyIndentMapper;
import com.xxx.proj.query.JinApplyQuery;
import com.xxx.proj.query.applyIndentQuery;
import com.xxx.proj.service.IJinApplyService;
/**
 *@className:JinController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月3日上午9:59:19
*/

@Service
@Transactional
public class JinApplyServiceImpl implements IJinApplyService{
	
	@Autowired
	private IJinApplyIndentMapper mapper;

	@Override
	public Map getApplyInfo(JinApplyQuery query) {
		List<JinApplyIndent> applyData = mapper.getApplyInfo(query);
		
		Integer applyTotal = mapper.getApplyTotal(query);
		
		Map map = new HashMap<>();
		
		map.put("applyData", applyData);
		map.put("applyTotal", applyTotal);
		return map;
	}
	/**
	 *  获取赛事名称
	 * @return
	 */
	@Override
	public List<Map> getGame() {
		
		return mapper.getGame();
	}
	/**
	 * 获取组类别名称
	 * @return
	 */
	@Override
	public List<Map> getGroup() {
		
		return mapper.getGroup();
	}
	/**
	 * 获取队伍名称
	 * @return
	 */
	@Override
	public List<Map> getTeam() {
		
		return mapper.getTeam();
	}
	@Override
	public Result upload(JinApplyIndent jin) {
		
		Date date=new Date(); 
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss"); 
		String time=formatter.format(date);
		jin.setJin(time);
		
		int[] list = jin.getStadiumList();
		if (list.length!=0) {
			int x = 1;
			for (int i : list) {
				if (x == 1) {
					/*jin.setGamenames(i+"");*/
					jin.setGamenames(String.valueOf(i));
				} else {
					jin.setGrouping(String.valueOf(i));
				}
				x++;
			}
		}
		
		mapper.upload(jin);
		return new Result(200,"添加成功");
	}
	/**
	 * 点击编辑加载数据
	 * @param id
	 * @return
	 */
	@Override
	public JinApplyIndent getEditApply(int id) {
		JinApplyIndent editApply = mapper.getEditApply(id);
		
		if (editApply.getGrouping()==null) {
			int[] Arr={Integer.parseInt(editApply.getGamenames())};
			editApply.setStadiumList(Arr);
					
		}else {
			int[] Arr={Integer.parseInt(editApply.getGamenames()),Integer.parseInt(editApply.getGrouping())};
			editApply.setStadiumList(Arr);
		}
		
		return editApply;
	}
	/**
	 * 修改
	 */
	@Override
	public Result editApply(JinApplyIndent jin) {
		int[] stadiumList = jin.getStadiumList(); // HTML传的赛事是数组，遍历一下
		int x = 1;
		for (int i : stadiumList) {
			if (x == 1) {
				jin.setGamenames(String.valueOf(i));
			} else {
				jin.setGrouping(String.valueOf(i));
			}
			x++;
		}
		mapper.editApply(jin);
		return new Result(200,"添加成功");
	}
	/**
	 * 删除
	 */
	@Override
	public Result deleteApply(int[] ids) {
		mapper.deleteApply(ids);		
		return new Result(200, "删除成功");
	}
	/**
	 * Excel导出
	 */
	@Override
	public Map getApplyInfoNoPage(JinApplyQuery jin) {
		List<JinApplyIndent> applyData = mapper.getApplyInfoNoPage(jin);
		
		Map<Object, Object> hashMap = new LinkedHashMap<>();
		
		
		hashMap.put("applyData", applyData);
		return  hashMap;
	}
	/**
	 * 赛事组别联动
	 */
	@Override
	public List<Map> gameList() {
		List<Map> list = mapper.getGame();
		
		for (Map map : list) {
			if (map.get("children").toString().equals("[null]")) {
				map.remove("children");
			}

		}
		
		
		return list;
		
		//return mapper.getGameList();
	}
	@Override
	public List<Map> cartogram(applyIndentQuery indent) {
		List<Map> cartogram = mapper.cartogram(indent);
		return cartogram;
	}


}
