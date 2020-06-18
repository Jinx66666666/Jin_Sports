package com.xxx.proj.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.entity.Result;
import com.xxx.proj.mapper.DisclaimerMapper;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.service.IDisclaimerListService;

@Service
@Transactional
public class DisclaimerListServiceImpl implements IDisclaimerListService {

	@Autowired
	private DisclaimerMapper mapper;

	/**
	 * 分页查询 列表 根据查询条件 和 分页查询
	 */
	@Override
	public Map getDisclaimerList(EmpQuery query) {

		List<Map> disclaimerList = mapper.getDisclaimerList(query);
		Integer total = mapper.getTotal(query);
		Map<Object, Object> map = new HashMap<>();
		map.put("total", total);
		map.put("disclaimerList", disclaimerList);

		return map;
	}

	/**
	 * 保存 1.若id存在，则修改 1.1判断修改前的免责声明名称和 修改后的是否相同 相同，直接修改保存
	 * 不相同，查询要修改的名字在数据库中存有相同的名字，没有就修改，有就失败 2.id不存在，添加记录 2.1 若免责声明名称存在一样的，失败，
	 */
	@Override
	public Result saveDisclaimer(Disclaimer disclaimer) {

		if (disclaimer.getId() == null) {// id不存在，添加
			Integer intName = mapper.selectByName(disclaimer.getDisclaimer()); // 查询名字是否已存在
			System.out.println(intName);
			if (intName != 0) {
				return new Result(300, "免责声明名称不能相同");
			}
			int i = mapper.insertSelective(disclaimer);
			if (i != 1) {
				return new Result(400, "添加失败");
			}
			return new Result(200, "添加成功");
		} else {

			Disclaimer disclaimer2 = mapper.selectByPrimaryKey(disclaimer.getId());
			if (disclaimer2.getDisclaimer().equals(disclaimer.getDisclaimer())) { // 修改前后相同
				int updateByPrimaryKey = mapper.updateByPrimaryKey(disclaimer);
				if (updateByPrimaryKey != 1) {
					return new Result(400, "修改失败");
				}
				return new Result(200, "修改成功");
			} else {
				// 修改前后不同
				Integer intNames = mapper.selectByName(disclaimer.getDisclaimer());
				System.out.println(intNames);
				if (intNames != 0) {
					return new Result(300, "免责声明名称不能相同");
				}
				int updateByPrimaryKey = mapper.updateByPrimaryKey(disclaimer);
				if (updateByPrimaryKey != 1) {
					return new Result(400, "修改失败");
				}
				return new Result(200, "修改成功");
			}
		}

	}

	/**
	 * id查一条记录
	 */
	@Override
	public Disclaimer selectDisclaimer(Integer id) {

		return mapper.selectByPrimaryKey(id);
	}

	/**
	 * 多条删除
	 */
	@Override
	public void deleteList(int[] ids) {
		mapper.deleteDisclaimerList(ids);
	}
}
