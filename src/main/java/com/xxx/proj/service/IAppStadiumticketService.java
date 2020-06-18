package com.xxx.proj.service;

import java.util.Map;

import com.xxx.proj.entity.OrderLook;
import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Stadiumticket;

public interface IAppStadiumticketService {

	/**
	 * App端添加场馆预定
	 * 
	 */
	String editStadiumticket(Stadiumticket s);

	/**
	 * 根据添加场馆，增加核销
	 * @param o
	 * @return
	 */

	Map editorderlook(OrderLook o);
}
