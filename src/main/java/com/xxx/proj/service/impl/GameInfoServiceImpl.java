package com.xxx.proj.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.entity.Employee;
import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.entity.Groupfrom;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.DisclaimerMapper;
import com.xxx.proj.mapper.GameinformationMapper;
import com.xxx.proj.mapper.GroupfromMapper;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.query.GameInfoQuery;
import com.xxx.proj.service.IGameInfoService;
import com.xxx.proj.util.EmpUtil;

@Service
@Transactional
public class GameInfoServiceImpl implements IGameInfoService {

	@Autowired
	private GameinformationMapper mapper;
	@Autowired
	private GroupfromMapper groupfromMapper;
	@Autowired
	private DisclaimerMapper disclaimerMapper;

	/**
	 * 获取组别列表 和 场地列表 免责声明
	 */
	@Override
	public Map getselectGroupAndField() {
		List<Map> groupAll = mapper.getGroupAll();
		List<Map> saiShiTiYu = mapper.getSaiShiTiYu();
		/*
		 * {children=[null], label=南城体育场, value=4} {children=[{label=乒乓球场馆,
		 * value=5}], label=雨薇体育场, value=5}
		 */

		for (Map map : saiShiTiYu) {
			if (map.get("children").toString().equals("[null]")) {
				map.remove("children");
			}
		}
		List<Map> disclaimerList = mapper.getDisclaimerList();

		Map<Object, Object> map = new HashMap<>();
		map.put("groupAll", groupAll);
		map.put("sportAll", saiShiTiYu);
		map.put("disclaimerList", disclaimerList);
		return map;
	}

	/**
	 * 保存 1.若id存在，则修改 1.1判断修改前的赛事名称和 修改后的是否相同 相同，直接修改保存
	 * 
	 * 
	 * 不相同，查询要修改的名字在数据库中存有相同的名字，没有就修改，有就失败 2.id不存在，添加记录 2.1 若赛事名称存在一样的，失败，
	 */
	@Override
	@Transactional
	public Result saveGameInfo(Gameinformation gameinfo) {

		if (gameinfo.getId() == null) { // 当id为空时， 添加
			Integer byName = mapper.selectByName(gameinfo.getGamename());
			if (byName != 0) {
				return new Result(300, "赛事名称已存在");
			}

			int[] stadiumList = gameinfo.getStadiumList(); // HTML传的场地是数组，遍历一下
			int x = 1;
			for (int i : stadiumList) {
				if (x == 1) {
					gameinfo.setSportid(i);
				} else {
					gameinfo.setStadiumid(i);
				}
				x++;
			}

			// 不存在相同赛事，添加赛事
			int i = mapper.insertSelective(gameinfo); // 成功为1 ，同时，得到插入的id
			if (i != 1) {
				return new Result(400, "网络开小差");
			}
			// 添加组别
			List<Groupfrom> domains = gameinfo.getDomains();
			for (Groupfrom groupfrom : domains) {
				groupfrom.setGameinid(gameinfo.getId());
				groupfromMapper.insertSelective(groupfrom);
			}
			return new Result(200, "保存成功");

		} else { // id存在，修改个人信息

			int[] stadiumList = gameinfo.getStadiumList(); // HTML传的场地是数组，遍历一下
			int x = 1;
			for (int i : stadiumList) {
				if (x == 1) {
					gameinfo.setSportid(i);
				} else {
					gameinfo.setStadiumid(i);
				}
				x++;
			}

			Gameinformation primaryKey = mapper.selectByPrimaryKey(gameinfo.getId());
			if (primaryKey.getGamename().equals(gameinfo.getGamename())) { // 修改前后
																			// 赛事名称相同
				// 修改记录
				int i = mapper.updateByPrimaryKeySelective(gameinfo);
				if (i != 1) {
					return new Result(400, "赛事修改失败");
				}
				groupfromMapper.deleteByGameinID(gameinfo.getId()); // 删除组别
				// 添加组别
				List<Groupfrom> domains = gameinfo.getDomains();
				for (Groupfrom groupfrom : domains) {
					groupfrom.setGameinid(gameinfo.getId());
					groupfromMapper.insertSelective(groupfrom);
				}

				return new Result(200, "保存成功");
			} else { // 修改前后 赛事名称不相同
				Integer byName = mapper.selectByName(gameinfo.getGamename());
				if (byName != 0) {
					return new Result(300, "赛事名称已存在");
				}

				// 修改记录
				int i = mapper.updateByPrimaryKeySelective(gameinfo);
				if (i != 1) {
					return new Result(400, "赛事修改失败");
				}
				groupfromMapper.deleteByGameinID(gameinfo.getId()); // 删除组别
				// 添加组别
				List<Groupfrom> domains = gameinfo.getDomains();
				for (Groupfrom groupfrom : domains) {
					groupfrom.setGameinid(gameinfo.getId());
					groupfromMapper.insertSelective(groupfrom);
				}

				return new Result(200, "保存成功");
			}

		}

	}

	/**
	 * 分页和条件查询
	 */
	@Override
	public Map getReload(GameInfoQuery query) {
		List<Map> reloadList = mapper.getReloadList(query);
		Integer reloadCount = mapper.getReloadCount(query);
		Map<Object, Object> map = new HashMap<>();
		map.put("reloadList", reloadList);
		map.put("reloadCount", reloadCount);
		return map;
	}

	/**
	 * id 查个人信息
	 */
	@Override
	public Gameinformation selectGameInfo(Integer id) {
		Gameinformation byPrimaryKey = mapper.selectByPrimaryKey(id);
		List<Groupfrom> byGameinID = groupfromMapper.selectByGameinID(id);
		byPrimaryKey.setDomains(byGameinID);

		if (byPrimaryKey.getStadiumid() != null) {
			int[] Arr = { byPrimaryKey.getSportid(), byPrimaryKey.getStadiumid() };
			byPrimaryKey.setStadiumList(Arr);
		} else {
			byPrimaryKey.setStadiumList(new int[byPrimaryKey.getSportid()]);
		}
		return byPrimaryKey;
	}

	/**
	 * 多条删除
	 */
	@Override
	public void deleteList(int[] ids) {
		mapper.deleteGameInfoList(ids);
		groupfromMapper.deleteGroupfromList(ids);
	}

	/**
	 * id查免责声明
	 */
	@Override
	public Disclaimer getDisclaimerContent(int id) {
		Disclaimer selectByPrimaryKey = disclaimerMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	/**
	 * 点击关闭
	 */
	@Override
	public void handleClose(int id) {
		Gameinformation gameinformation = mapper.selectByPrimaryKey(id);
		mapper.updateStadiemOpen(gameinformation.getStadiumid());
		mapper.handleClose(id, EmpUtil.getEmp().getName());
	}

	/**
	 * 点击开启
	 */
	@Override
	public void handleOpen(int id) {
		Gameinformation gameinformation = mapper.selectByPrimaryKey(id);
		mapper.updateStadiemClose(gameinformation.getStadiumid());
		mapper.handleOpen(id, EmpUtil.getEmp().getName());
	}

}
