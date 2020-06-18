package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Video;
import com.xxx.proj.query.JinTeamQuery;

/**
 *@className:IVideoService.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月5日上午11:11:09
*/
public interface IVideoService {

	Map getVideo(JinTeamQuery query);

	Result addVideo(Video v);

	Video getEditVideo(int id);

	Result editVideo(Video v);

	Result deleteVideo(int[] ids);

	

}
