package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;

public interface IDisclaimerListService {

	Map getDisclaimerList(EmpQuery query);

	Result saveDisclaimer(Disclaimer disclaimer);

	Disclaimer selectDisclaimer(Integer id);

	void deleteList(int[] ids);

}
