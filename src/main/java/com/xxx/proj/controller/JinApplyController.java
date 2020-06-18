package com.xxx.proj.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.ApplyExcelExport;
import com.xxx.proj.entity.JinApplyIndent;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.JinApplyQuery;
import com.xxx.proj.query.applyIndentQuery;
import com.xxx.proj.service.IJinApplyService;
import com.xxx.proj.util.PoiExcelExport;


/**
 *@className:JinController.java
 *@discripton:天行健，君子以自强不息。
 *@author:黄晶
 *@createTime:2019年1月3日上午9:59:19
*/
@RestController
@RequestMapping("/apply")
public class JinApplyController {
	
	@Autowired
	private IJinApplyService service;
	
	/**
	 * 分页和搜索组类别名称和队伍名称
	 * @param query
	 * @return
	 */
	@RequestMapping("/getApplyInfo")
	public Map getApplyInfo(@RequestBody JinApplyQuery query){

		return service.getApplyInfo(query);
	}
	/**
	 *  获取赛事名称
	 * @return
	 */
	@RequestMapping("/getGame")
	public List<Map> getGame(){
		return service.getGame();		
	}
	/**
	 * 获取组类别名称
	 * @return
	 */
	@RequestMapping("/getGroup")
	public List<Map> getGroup(){
		return service.getGroup();		
	}
	/**
	 * 获取队伍名称
	 * @return
	 */
	@RequestMapping("/getTeam")
	public List<Map> getTeam(){
		return service.getTeam();		
	}
	/**
	 * 新增赛事报名订单	
	 * @param jin
	 * @return
	 */
	@RequestMapping("/addApply")
	public Result upload(@RequestBody JinApplyIndent jin){
		
		return service.upload(jin);		
		
	}
	
	
	
	/**
	 * 编辑加载信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/getEditApply")
	public JinApplyIndent getEditApply(int id){
		return service.getEditApply(id);		
	}
	/**
	 * 修改赛事报名订单信息
	 * @param jin
	 * @return
	 */
	@RequestMapping("/editApply")
	public Result editApply(@RequestBody JinApplyIndent jin){
		return service.editApply(jin);		
	}
	@RequestMapping("/deleteApply")
	public Result deleteApply(@RequestBody int[] ids){
		
		return service.deleteApply(ids);				
	}
	/**
	 * 获取当前登录用户
	 * @return
	 */
	/*@RequestMapping("/getUser")
	public String getUser(){
		Employee emp = EmpUtil.getEmp();
		return emp.getName();
	}*/
	
	@Value("${spring.http.multipart.location}")
	String  rootPath;
	
	/**
	 * 图片上传
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/upload")
	 public String uploadPic(HttpServletRequest request) throws Exception{
		String requestURI = request.getRequestURI();
		Part part = request.getPart("file");
		String urlPath = UUID.randomUUID()+part.getContentType().replace("image/", ".");
		String idcardphoto = "/"+requestURI.split("/")[1]+"/"+urlPath;
		IOUtils.copy(part.getInputStream(), new FileOutputStream(rootPath+urlPath));
		
		return idcardphoto;
	}
	/**
	 * 导出Excel
	 * @param id
	 * @param resp
	 * @throws Exception
	 */
	@RequestMapping("/excelExport")
	public void getExcelTest(HttpServletResponse resp,JinApplyQuery jin) throws Exception {
		
		PoiExcelExport pee = new PoiExcelExport("E:/赛事报名订单信息表.xls", "sheet1");
		Map applyInfoNoPage =  service.getApplyInfoNoPage(jin);
		
		// 数
		List<Map> object = (List<Map>) applyInfoNoPage.get("applyData");
		System.out.println(object.size());
		List<ApplyExcelExport> dataList1 = new ArrayList();

		for (Map<String, Object> m : object) {
			ApplyExcelExport excelExport = new ApplyExcelExport();
			for (String k : m.keySet()) {
				System.out.println(k + ":" + m.get(k));
				if (k.equals("gamename")) {
					excelExport.setGamename(m.get(k));
				} else if (k.equals("paystate")) {
					if (m.get(k).equals(0)) {
						k = "未付款";
						System.out.println(k);
					} else {
						k = "已付款";
						System.out.println(k);
					}

					excelExport.setPaystate(k);
				} else if (k.equals("sex")) {
					if (m.get(k).equals("男")) {
						k = "男";
						System.out.println(k);
					} else {
						k = "女";
						System.out.println(k);
					}
					excelExport.setSex(k);
				} else if (k.equals("grouping")) {
					excelExport.setGname(m.get(k));
				} else if (k.equals("applyname")) {
					excelExport.setApplyname(m.get(k));
				} else if (k.equals("idcard")) {
					excelExport.setIdcard(m.get(k));
				} else if (k.equals("teamnames")) {
					excelExport.setTeamnames(m.get(k));
				} else if (k.equals("phone")) {
					excelExport.setPhone(m.get(k));
				/*} else if (k.equals("id")) {
					excelExport.setId(m.get(k));*/
				} else if (k.equals("applydate")) {
					excelExport.setApplydate(m.get(k));
				}

			}
			System.out.println(excelExport);
			dataList1.add(excelExport);
		}
		int titleSize[] = { 13, 13, 13, 13, 13, 13, 13, 13, 13, 13 };
		String titleColumn[] = {"gamename", "gname", "applyname", "idcard", "sex", "teamnames", "phone",
				"applydate", "paystate" };
		String titleName[] = {"赛事名称", "参赛组别", "姓名", "身份证号", "性别", "队伍名称", "手机号码", "报名日期", "是否付款" };
		pee.setAddress("A:H"); // 自动筛选
		pee.wirteExcel(titleColumn, titleName, titleSize, dataList1);
		ServletOutputStream outputStream = resp.getOutputStream();
		resp.setHeader("Content-type", "application/vnd.ms-excel;charset=UTF-8");
		resp.setHeader("Content-Disposition", "attachment;filename=EventList.xls");
		FileInputStream fileInputStream = new FileInputStream("E:/赛事报名订单信息表.xls");
		IOUtils.copy(fileInputStream, outputStream);
	}
	/**
	 * 赛事组别联动
	 * @return
	 */
	@RequestMapping("/gameList")
	public List<Map> gameList() {
		/*Map gameList = service.gameList();*/
		return service.gameList();

	}
	/**
	 * 统计图
	 */
	@RequestMapping("/cartogram")
	public List<Map> cartogram(@RequestBody(required = false) applyIndentQuery indent){
		
		return service.cartogram(indent);		
		
	}
	
}
