package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Grouptype;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;

public interface IGrouptypeService {

	Map getGrouptypeList(EmpQuery query);

	Result saveGrouptype(Grouptype grouptype);

	Map selectGrouptype(Integer id);

	void deleteList(int[] ids);

	


}
