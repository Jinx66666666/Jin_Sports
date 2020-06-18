package com.xxx.proj.service;



import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.JinApplyQuery;
import com.xxx.proj.query.applyIndentQuery;

/**
 *@className:JinController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月3日上午9:59:19
*/
public interface IJinApplyService {

	Map getApplyInfo(JinApplyQuery query);

	List<Map> getGame();

	List<Map> getGroup();

	List<Map> getTeam();

	Result upload(JinApplyIndent jin);

	JinApplyIndent getEditApply(int id);

	Result editApply(JinApplyIndent jin);

	Result deleteApply(int[] ids);

	Map getApplyInfoNoPage(JinApplyQuery jin);

	List<Map> gameList();

	List<Map> cartogram(applyIndentQuery indent);		
}
