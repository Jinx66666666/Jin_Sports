package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.SportAdd;
import com.xxx.proj.mapper.ISportMapper;
import com.xxx.proj.query.SportsQuery;
import com.xxx.proj.service.ISportService;

@Service
@Transactional
public class SportServiceImpl implements ISportService{
	@Autowired
	private ISportMapper SportMapper;

	@Override
	public Map getSport(SportsQuery query) {
		List<Map> getsport =  SportMapper.getSport(query);
		Integer gettotal = SportMapper.getTotal(query);
		Map map = new HashMap();
		map.put("getsport", getsport);
		map.put("gettotal", gettotal);
		return map;
	}

	@Override
	public Result addSports(SportAdd s) {
		
			Integer intName = SportMapper.selectByName(s.getSportname()); // 查询名字是否已存在
			if (intName != 0) {
				return new Result(300, "体育场名称不能相同");
			}
			int add = SportMapper.addSports(s);
			if (add != 1) {
				return new Result(400, "添加失败");
			}
			return new Result(200, "添加成功");
		}
		/*SportMapper.addSports(s);
		return new Result(200, "添加成功");*/


	@Override
	public Result editSports(SportAdd s) {
		int edit = SportMapper.editSports(s);
		if (edit != 1) {
			return new Result(400, "添加失败");
		}
		return new Result(200, "添加成功");
	}

	@Override
	public SportAdd getSportById(int id) {
		
		return SportMapper.getSportById(id);
	}

	@Override
	public Result deleteSport(int[] ids) {
		SportMapper.deleteSport(ids);
		return new Result(200,"删除成功");
	}
}
