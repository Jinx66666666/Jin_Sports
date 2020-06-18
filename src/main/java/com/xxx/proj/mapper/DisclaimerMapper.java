package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.query.EmpQuery;

public interface DisclaimerMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Disclaimer record);

	int insertSelective(Disclaimer record);

	Disclaimer selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Disclaimer record);

	int updateByPrimaryKey(Disclaimer record);

	/**
	 * 
	 * @param query
	 *            分页加条件查询
	 * @return
	 */
	List<Map> getDisclaimerList(EmpQuery query);

	/**
	 * 
	 * @param query
	 *            分页加条件查询 总条数
	 * @return
	 */
	Integer getTotal(EmpQuery query);

	/**
	 * 
	 * @param disclaimer
	 *            查询是否有相同的声明名称
	 * @return
	 */
	Integer selectByName(@Param("disclaimer") String disclaimer);

	/**
	 * 
	 * @param ids
	 *            多条删除 数组
	 */
	void deleteDisclaimerList(int[] ids);
}