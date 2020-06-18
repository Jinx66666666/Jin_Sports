package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Grouptype;
import com.xxx.proj.query.EmpQuery;

public interface GrouptypeMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Grouptype record);

	int insertSelective(Grouptype record);

	Grouptype selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Grouptype record);

	int updateByPrimaryKey(Grouptype record);

	/**
	 * 
	 * @param query
	 *            条件加分页 查询
	 * @return
	 */
	List<Map> getGrouptypeList(EmpQuery query);

	/**
	 * 
	 * @param query
	 *            条件家分页 查总数量
	 * @return
	 */
	Integer getTotal(EmpQuery query);

	/**
	 * 根据名称查询 包含的记录数量
	 * 
	 * @param gname
	 * @return
	 */
	Integer selectByName(String gname);

	/**
	 * 
	 * @param id
	 *            id 查记录
	 * @return
	 */
	Map selectById(Integer id);
	/**
	 * 
	 * @param ids
	 *            多条删除 数组
	 */
	void deleteGrouptypeList(int[] ids);



}