package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.entity.Grouptype;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.GrouptypeMapper;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.service.IGrouptypeService;

@Service
@Transactional
public class GrouptypeImpl implements IGrouptypeService {

	@Autowired
	private GrouptypeMapper mapper;

	/*
	 * Grouptype
	 * 
	 * Disclaimer
	 * 
	 */
	/**
	 * 分页查询 列表 根据查询条件 和 分页查询
	 */
	@Override
	public Map getGrouptypeList(EmpQuery query) {

		List<Map> grouptypeList = mapper.getGrouptypeList(query);
		Integer total = mapper.getTotal(query);
		Map<Object, Object> map = new HashMap<>();
		map.put("total", total);
		map.put("grouptypeList", grouptypeList);

		return map;
	}

	/**
	 * 保存 
	 * 	1. id存在， 
	 * 			1.1 查询要修改的名称在数据库中是否以存在。。
	 * 				存在即失败，否则成功
	 * 						
	 * 	2. id不存在，新增。。
	 * 		判断名字是否有相同的
	 */
	@Override
	public Result saveGrouptype(Grouptype grouptype) {
		System.out.println("---===-=-===-");
		System.out.println("service");
		if (grouptype.getId() == null) {		// id不存在
			Integer intName = mapper.selectByName(grouptype.getGname()); // 查询名字是否已存在
			System.out.println(intName);
			if (intName != 0) {
				return new Result(300, "组别名称不能相同");
			}
			int i = mapper.insertSelective(grouptype);
			if (i != 1) {
				return new Result(400, "添加失败");
			}
			return new Result(200, "添加成功");
		} else {//id存在， 修改内容
				
			Grouptype grouptype2 = mapper.selectByPrimaryKey(grouptype.getId());
			if (grouptype2.getGname().equals(grouptype.getGname())) { 	// 修改前后  名称相同   即为名称不变，修改的是其他的内容
				int updateByPrimaryKey = mapper.updateByPrimaryKey(grouptype);
				if (updateByPrimaryKey != 1) {
					return new Result(400, "修改失败");
				}
				return new Result(200, "修改成功");
			} else {
				// 修改前后   名称不同   判断要修改的名称在数据库中是否 已存在  
				//查询的数量
				Integer intNames = mapper.selectByName(grouptype.getGname());
				System.out.println(intNames);
				if (intNames != 0) {
					return new Result(300, "组别名称不能相同");
				}
				int updateByPrimaryKey = mapper.updateByPrimaryKey(grouptype);
				if (updateByPrimaryKey != 1) {
					return new Result(400, "修改失败");
				}
				return new Result(200, "修改成功");
			}
		}
	}

	/**
	 * id 查个人信息
	 *  将int型的whethergroup转换为 String型
	 *  	..
	 */
	@Override
	public Map selectGrouptype(Integer id) {
		 Map map = mapper.selectById(id);
		String string = map.get("whethergroup").toString();
		map.put("whethergroup", string);
		String string2 = map.get("whetherpay").toString();
		map.put("whetherpay", string2);
		return map;
	}

	/**
	 * 多条删除
	 */
	@Override
	public void deleteList(int[] ids) {
		mapper.deleteGrouptypeList(ids);

	}


}
