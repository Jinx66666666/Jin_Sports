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
import org.springframework.web.multipart.MultipartFile;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.Video;
import com.xxx.proj.query.JinTeamQuery;
import com.xxx.proj.service.IVideoService;

/**
 *@className:VideoController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月5日上午11:10:08
*/
@RestController
@RequestMapping("/video")
public class VideoController {
	
	@Autowired
	private IVideoService service;
	
	/**
	 * 获取赛事回放信息
	 * @param query
	 * @return
	 */
	@RequestMapping("/getVideo")
	public Map getVideo(@RequestBody JinTeamQuery query){
		return service.getVideo(query);
		
	}
	/**
	 * 添加赛事视频
	 * @param v
	 * @return
	 */
	@RequestMapping("/addVideo")
	public Result addVideo(@RequestBody Video v){
		return service.addVideo(v);		
	}
	/**
	 * 点击编辑加载赛事视频数据
	 * @param id
	 * @return
	 */
	@RequestMapping("/getEditVideo")
	public Video getEditVideo(int id){
		return service.getEditVideo(id);		
	}
	/**
	 * 修改赛事视频数据
	 * @param v
	 * @return
	 */
	@RequestMapping("/editVideo")
	public Result editVideo(@RequestBody Video v){
		return service.editVideo(v);		
	}
	@RequestMapping("/deleteVideo")
	public Result deleteVideo(@RequestBody int[] ids){
		System.out.println(ids+"++++++++++++");
		
		return service.deleteVideo(ids);
	}
	/**
	 * 图片上传
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@Value("${spring.http.multipart.location}")
	String  rootPath;
		
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
	/**
	 * 视频上传
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@Value("${spring.http.multipart.location}")
	String  rootPaths;
	@RequestMapping("/upVideo")
	 public String uploadVideo(HttpServletRequest request) throws Exception{
		String requestURI = request.getRequestURI();
		Part part = request.getPart("file");
		String urlPath = UUID.randomUUID()+part.getContentType().replace("video/", ".");
		String video = "/"+requestURI.split("/")[1]+"/"+urlPath;
		IOUtils.copy(part.getInputStream(), new FileOutputStream(rootPath+urlPath));
		System.out.println(video);
		return video;
	}
	/*@Value("${spring.http.multipart.location}")
	String  rootPath1;      
	
	@RequestMapping("/uploadImage")
	public String upload(MultipartFile videopicture,Video v) throws Exception{
		System.out.println(v);
		//1 将图片存储到服务器路径下   D:/projectImage/   image/jpeg /
		String urlPath = UUID.randomUUID()+videopicture.getContentType().replace("image/", ".");
		//head.getInputStream() 上传图片的流    ----- 复制  ------ 》new FileOutputStream(rootPath+urlPath)
		// rootPath ${spring.http.multipart.location} 读取配置文件配置的图片存放路径
		// urlPath 存储的文件名
		// rootPath+urlPath 要拷贝到哪的文件绝对路径  D:/projectImage/sadfjkasdfhaskdljfhaksldf.jpg
		IOUtils.copy(videopicture.getInputStream(), new FileOutputStream(rootPath1+urlPath));
		//2 将上传的图片 服务器路径存储到 数据库   http://localhost:80/ssm/sadffasdf.jpg
		
		return "/videoInfo";
	}*/
}
