package com.xxx.proj.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.query.GameInfoQuery;

public interface GameinformationMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Gameinformation record);

	int insertSelective(Gameinformation record);

	Gameinformation selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Gameinformation record);

	int updateByPrimaryKeyWithBLOBs(Gameinformation record);

	int updateByPrimaryKey(Gameinformation record);

	/**
	 * 
	 * @return 查询所有的场馆
	 */
	List<Map> getSaiShiTiYu();

	List<Map> getSaiShiChangGuan();

	/**
	 * 
	 * @return 查询所有的组别
	 */
	List<Map> getGroupAll();

	/**
	 * 查询所有的免责声明
	 * 
	 * @return
	 */

	List<Map> getDisclaimerList();

	/**
	 * 名字查询存在数量
	 * 
	 * @param gamename
	 * @return
	 */
	Integer selectByName(String gamename);

	/**
	 * 
	 * @param query
	 *            条件加分页查询
	 * @return
	 */
	List<Map> getReloadList(GameInfoQuery query);

	/**
	 * 
	 * @param query条件加分页查询
	 *            总记录数
	 * @return
	 */
	Integer getReloadCount(GameInfoQuery query);

	/**
	 * 
	 * @param ids
	 *            多条删除 数组
	 */
	void deleteGameInfoList(int[] ids);

	/**
	 * 赛事关闭
	 * 
	 * @param id
	 * @param name
	 *            操作人
	 */
	void handleClose(@Param("id") int id,@Param("manipuler") String manipuler);

	/**
	 * 赛事开启
	 * 
	 * @param id
	 * @param name
	 */
	void handleOpen(@Param("id") int id,@Param("manipuler") String manipuler);

	void updateStadiemOpen(@Param("stadiumid") Integer stadiumid);

	void updateStadiemClose(@Param("stadiumid") Integer stadiumid);
	
	
}