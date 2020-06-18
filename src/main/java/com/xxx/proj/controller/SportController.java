package com.xxx.proj.controller;

import java.io.FileOutputStream;
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

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.SportAdd;
import com.xxx.proj.query.SportsQuery;
import com.xxx.proj.service.ISportService;

/**
 * 体育场信息页面
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sport")
public class SportController {

	@Autowired
	private ISportService sportService;
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@RequestMapping("/getSport")
	public Map getSport(@RequestBody SportsQuery query){
		
		return sportService.getSport(query);
	}
	
	@RequestMapping("/addSports")
	public Result addSports(@RequestBody SportAdd s){
		return sportService.addSports(s);
		
	}
	@RequestMapping("/editSports")
	public Result editSports(@RequestBody SportAdd s){
		return sportService.editSports(s);
		
	}
	@RequestMapping("/getSportById")
	public SportAdd getSportById(int id){
		return sportService.getSportById(id);
	}
	@RequestMapping("/deleteSport")
	public Result deleteSport(@RequestBody int[] ids){
		return sportService.deleteSport(ids);
	}
	
	
	@Value(value = "${spring.http.multipart.location}")
	String rootPath;
	@RequestMapping("/upload")
	public String uploadPic(HttpServletRequest request) throws Exception{
		String requestURI = request.getRequestURI();
		Part part = request.getPart("file");
		String urlPath = UUID.randomUUID()+part.getContentType().replace("image/", ".");
		String videopicture = "/"+requestURI.split("/")[1]+"/"+urlPath;
		IOUtils.copy(part.getInputStream(), new FileOutputStream(rootPath+urlPath));
		return videopicture;
	}
	
}
