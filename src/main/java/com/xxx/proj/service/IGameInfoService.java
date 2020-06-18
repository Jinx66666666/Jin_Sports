package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.query.GameInfoQuery;

public interface IGameInfoService {

	Map getselectGroupAndField();

	Result saveGameInfo(Gameinformation gameinfo);

	Map getReload(GameInfoQuery query);

	Gameinformation selectGameInfo(Integer id);

	void deleteList(int[] ids);

	Disclaimer getDisclaimerContent(int id);

	void handleClose(int id);

	void handleOpen(int id);

}
