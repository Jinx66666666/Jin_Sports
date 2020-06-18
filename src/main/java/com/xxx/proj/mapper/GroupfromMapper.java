package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Groupfrom;

public interface GroupfromMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Groupfrom record);

	int insertSelective(Groupfrom record);

	Groupfrom selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Groupfrom record);

	int updateByPrimaryKey(Groupfrom record);

	List<Groupfrom> selectByGameinID(Integer id);

	void deleteByGameinID(Integer id);

	/**
	 * 
	 * @param ids
	 *            多条删除 数组
	 */
	void deleteGroupfromList(int[] ids);

}