package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.JinApplyQuery;
import com.xxx.proj.query.applyIndentQuery;

public interface IJinApplyIndentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JinApplyIndent record);

    int insertSelective(JinApplyIndent record);

    JinApplyIndent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JinApplyIndent record);

    int updateByPrimaryKey(JinApplyIndent record);

	List<JinApplyIndent> getApplyInfo(JinApplyQuery query);

	Integer getApplyTotal(JinApplyQuery query);

	List<Map> getGame();

	List<Map> getGroup();

	List<Map> getTeam();

	void upload(JinApplyIndent jin);

	JinApplyIndent getEditApply(int id);

	void editApply(JinApplyIndent jin);

	void deleteApply(int[] ids);

	List<JinApplyIndent> getApplyInfoNoPage(JinApplyQuery jin);

	List<Map> getGameList();

	List<Map> cartogram(applyIndentQuery indent);
}