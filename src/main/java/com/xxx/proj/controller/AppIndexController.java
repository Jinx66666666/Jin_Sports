package com.xxx.proj.controller;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.xxx.proj.entity.Dynamic;
import com.xxx.proj.entity.Gameinformation;
import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.JinTeamInfo;
import com.xxx.proj.entity.Result;
import com.xxx.proj.service.IAppIndexService;

/**
 *@className:AppIndexController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月15日上午11:55:49
*/
@RestController
@RequestMapping("/appindex")
public class AppIndexController {
	@Autowired 
	private IAppIndexService service;
	
	/**
	 * 获取App首页赛事信息
	 */
	@RequestMapping("/getGame")
	public Map getGame(){
		
		return service.getGame();
	}
	/**
	 * 根据赛事获取赛事详情
	 */
	@RequestMapping("/getGameInfo")
	public Map getGameInfo(Gameinformation g){
		return service.getGameInfo(g);
	}
	/**
	 * 根据赛事名称查询免责声明
	 */
	@RequestMapping("/getContent")
	public Map getContent(Gameinformation g){
		return service.getContent(g);
	}
	/**
	 * 根据赛事名称查询组别信息
	 */
	@RequestMapping("/getGroup")
	public Map getGroup(Gameinformation g){
		return service.getGroup(g);
	}
	/**
	 * 报名赛事订单添加
	 */
	@RequestMapping("/addOrder")
	public String addOrder(JinApplyIndent j){
				
		return service.addOrder(j);		
	}
	
	/**
	 * 
	 * 获取最新动态
	 */
	@RequestMapping("/getNews")
	public Map getNews(Dynamic c){
		
		
		return service.getNews(c);		
	}
	
	/**
	 * 团队信息添加
	 */
	@RequestMapping("/addTeam")
	public Result addTeam(JinTeamInfo j){
		
		return service.addTeam(j);		
	}
	/**
	 * 图片上传
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@Value("${spring.http.multipart.location}")
	String  rootPath;
	
	@RequestMapping("/uploadApp")
	 public String uploadApp(HttpServletRequest request) throws Exception{
		String requestURI = request.getRequestURI();
		Part part = request.getPart("file");
		String urlPath = UUID.randomUUID()+part.getContentType().replace("image/", ".");
		String idcardphoto = "/"+requestURI.split("/")[1]+"/"+urlPath;
		IOUtils.copy(part.getInputStream(), new FileOutputStream(rootPath+urlPath));
		
		return idcardphoto;
	}
	
}
