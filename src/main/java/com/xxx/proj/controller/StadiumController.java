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

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.SportAdd;
import com.xxx.proj.entity.Stadium;
import com.xxx.proj.query.StadiumQuery;
import com.xxx.proj.service.IStadiumService;



/**
 * 场馆信息页面
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/stadium")
public class StadiumController {

	@Autowired
	private IStadiumService stadiumService;
	
	@RequestMapping("/getStadium")
	public Map getStadium(@RequestBody StadiumQuery query){
		
		return stadiumService.getStadium(query);
	}
	@RequestMapping("/getSport")
	public List<Map> getSport(){
		return stadiumService.getSport();
		
	}
	@RequestMapping("/addStadium")
	public Result addStadium(@RequestBody Stadium s){
		return stadiumService.addStadium(s);
		
	}
	@RequestMapping("/editStadium")
	public Result editStadium(@RequestBody Stadium s){
		return stadiumService.editStadium(s);
		
	}
	@RequestMapping("/getStadiumById")
	public Stadium getStadiumById(int id){
		return stadiumService.getStadiumById(id);
	}
	@RequestMapping("/deleteStadium")
	public Result deleteStadium(@RequestBody int[] ids){
		return stadiumService.deleteStadium(ids);
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
		System.out.println(videopicture);
		return videopicture;
		
	}
}
