package com.xxx.proj.mapper;

import java.util.List;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.query.DynamicQuery;

public interface IDynamicMapper {
	


	List<Dynamic> getDynamic(DynamicQuery query);

	Integer getTotal(DynamicQuery query);

	void addDynamic(Dynamic e);

	void editDynamic(Dynamic e);

	Dynamic getDynamicByID(int id);

	void deleteDynamic(int[] ids);



}
