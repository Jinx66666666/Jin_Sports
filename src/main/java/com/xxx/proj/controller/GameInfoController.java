package com.xxx.proj.controller;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.Disclaimer;
import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.EmpQuery;
import com.xxx.proj.query.GameInfoQuery;
import com.xxx.proj.service.IGameInfoService;

@RestController
@RequestMapping("/gameinfo")
public class GameInfoController {

	@Autowired
	private IGameInfoService service;

	/**
	 * 获取组别，场地，声明
	 * 
	 * @return
	 */
	@RequestMapping("getselectGroupAndField")
	public Map getselectGroupAndField() {
		Map getselectGroupAndField = service.getselectGroupAndField();
		return getselectGroupAndField;

	}

	/**
	 * 
	 * @param Gameinfo
	 *            保存，修改信息
	 * @return
	 */
	@RequestMapping("saveGameInfo")
	public Result saveGameInfo(@RequestBody Gameinformation gameinfo) {

		return service.saveGameInfo(gameinfo);

	}

	/**
	 * 
	 * @param query
	 *            分页和条件查询
	 * @return
	 */
	@RequestMapping("getReload")
	public Map getReload(@RequestBody GameInfoQuery query) {

		return service.getReload(query);
	}

	/**
	 * id 查个人信息
	 * 
	 * @param disclaimer
	 * @return
	 */
	@RequestMapping("selectGameInfo")
	public Gameinformation selectGameInfo(Integer id) {
		return service.selectGameInfo(id);
	}

	/**
	 * 图片上传
	 * 
	 */
	@Value(value = "${spring.http.multipart.location}")
	String rootPath;

	@RequestMapping("/upload")
	public String uploadPic(HttpServletRequest request) throws Exception {
		String requestURI = request.getRequestURI();
		Part part = request.getPart("file");
		String urlPath = UUID.randomUUID() + part.getContentType().replace("image/", ".");
		String videopicture = "/" + requestURI.split("/")[1] + "/" + urlPath;
		IOUtils.copy(part.getInputStream(), new FileOutputStream(rootPath + urlPath));
		return videopicture;
	}

	/**
	 * id查免责声明
	 * @return 
	 * 
	 */
	@RequestMapping("getDisclaimerContent")
	public Disclaimer getDisclaimerContent(int id) {
		Disclaimer disclaimer = service.getDisclaimerContent(id);
		return disclaimer;
	}

	/**
	 * id数组多条删除
	 * 
	 * @param disclaimer
	 * @return
	 */
	@RequestMapping("deletelist")
	public void deleteList(@RequestBody int[] ids) {
		service.deleteList(ids);
	}
	
	
	/**
	 * 点击关闭
	 * @return 
	 * 
	 */
	@RequestMapping("handleClose")
	public Disclaimer handleClose(int id) {
		service.handleClose(id);
		return null;
		
	}
	/**
	 * 点击开启
	 * @return 
	 * 
	 */
	@RequestMapping("handleOpen")
	public Disclaimer handleOpen(int id) {
		service.handleOpen(id);
		return null;
		
	}
}
