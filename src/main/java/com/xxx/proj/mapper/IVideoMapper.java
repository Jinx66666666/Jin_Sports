package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Video;
import com.xxx.proj.query.JinTeamQuery;

public interface IVideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

	List<Map> getVideo(JinTeamQuery query);

	Integer getVideoTotal(JinTeamQuery query);

	void AddVideo(Video v);

	Video getEditVideo(int id);

	void editVideo(Video v);

	void deleteVideo(int[] ids);
}