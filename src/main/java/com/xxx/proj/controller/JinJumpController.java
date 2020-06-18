package com.xxx.proj.controller;

import java.io.FileOutputStream;
import java.util.UUID;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.util.EmpUtil;

/**
 *@className:JinJumpController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月2日下午10:09:02
*/
@Controller
public class JinJumpController {
	/**
	 * 顶部退出
	 * @param e
	 * @return
	 */
	@RequestMapping("/toback")
	public String toback (EmpUtil e){
		e.removeEmp();
		return "redirect:/";
	}
	/**
	 * 跳转赛事报名参赛组信息
	 */
	@RequestMapping("/teamInfo")
	public String goToEmp(){
		return "teamInfo";
	}
	/**
	 * 跳转赛事报名参赛组信息
	 */
	@RequestMapping("/applyInfo")
	public String goToapplyInfo(){
		return "applyInfo";
	}
	/**
	 * 跳转赛事回放
	 * @return
	 */
	@RequestMapping("/videoInfo")
	public String videoInfo(){
		return "videoInfo";
	}
	/*@Value("${spring.http.multipart.location}")
	String  rootPath;      
	
	@RequestMapping("/upload")
	public String upload(MultipartFile head,@RequestBody JinApplyIndent jin) throws Exception{
		//1 将图片存储到服务器路径下   D:/projectImage/   image/jpeg /
		String urlPath = UUID.randomUUID()+head.getContentType().replace("image/", ".");
		//head.getInputStream() 上传图片的流    ----- 复制  ------ 》new FileOutputStream(rootPath+urlPath)
		// rootPath ${spring.http.multipart.location} 读取配置文件配置的图片存放路径
		// urlPath 存储的文件名
		// rootPath+urlPath 要拷贝到哪的文件绝对路径  D:/projectImage/sadfjkasdfhaskdljfhaksldf.jpg
		IOUtils.copy(head.getInputStream(), new FileOutputStream(rootPath+urlPath));
		//2 将上传的图片 服务器路径存储到 数据库   http://localhost:80/ssm/sadffasdf.jpg
		
		return "/applyInfo";
	}*/
	/**
	 * 跳转统计图
	 */
	@RequestMapping("/jincartogram")
	public String jincartogram(){
		return "jincartogram";
	}


}
