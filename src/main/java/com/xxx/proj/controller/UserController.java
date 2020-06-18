package com.xxx.proj.controller;

import java.io.File;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.query.UserQuery;
import com.xxx.proj.service.IUsersService;
import com.xxx.proj.util.CodeSessionUtil;
import com.xxx.proj.util.UserUtil;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired 
	private IUsersService usersService;
	
	/**
	 * 获取所有用户信息
	 * @param query
	 * @return
	 */
	@RequestMapping("/getUsers")
	public Map getUsers(@RequestBody UserQuery query){
		return usersService.getUsers(query);
	}
	/**
	 * 添加用户信息
	 * @param u
	 * @return
	 */
	@RequestMapping("/addUser")
	public Result addUser(@RequestBody UserPeople u){
		 
		return usersService.addUser(u); 
	}
	/**
	 * 修改用户信息  
	 * @param u
	 * @return
	 */
	@RequestMapping("/editUser")
	public Result editUser(@RequestBody UserPeople u){
		return usersService.editUser(u);
	}
	/**
	 * 查询单个用户信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/getUserByID")
	public UserPeople getUserByID(int id){ 
		return usersService.getUserByID(id);
		
	}
	/**
	 * 删除用户
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteUsers")
	public Result deleteUsers(@RequestBody int[] ids){
		return usersService.deleteUsers(ids);
		   
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
