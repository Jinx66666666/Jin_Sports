package com.xxx.proj.controller;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.proj.entity.OrderLook;
import com.xxx.proj.entity.Result;
import com.xxx.proj.query.OrderLookQuery;
import com.xxx.proj.service.IOrderLookService;
import com.xxx.proj.util.PoiExcelExport;

@RestController
@RequestMapping("/orderlook")
public class OrderLookController {

	@Autowired
	private IOrderLookService OrderLookService;

	@RequestMapping("getOrderLook")
	public Map getOrderLook(@RequestBody OrderLookQuery query) {
		return OrderLookService.getOrderLook(query);

	}

	@RequestMapping("/getOrderLookById")
	public OrderLook getOrderLookById(int id) {
		return OrderLookService.getOrderLookById(id);
	}

	@RequestMapping("/editOrderlook")
	public Result editOrderlook(@RequestBody OrderLook o) {
		return OrderLookService.editOrderlook(o);
	}

	/**
     * 导出报表
     * @return
     */
	@RequestMapping("/excelOrderLook")
	public void getExcelOrderLook(HttpServletResponse resp) throws Exception {
		System.out.println();
		PoiExcelExport pee = new PoiExcelExport("E:/订单核销表.xls", "sheet1");
		Map excelorderlook =  OrderLookService.getExcelOrderLook();
		// 数
		List<Map> object = (List<Map>) excelorderlook.get("applyData");
		System.out.println(object.size());
		List<OrderLook> dataList1 = new ArrayList();

		for (Map<String, Object> m : object) {
			OrderLook orderLook = new OrderLook();
			for (String k : m.keySet()) {
				System.out.println(k + ":" + m.get(k));
				if (k.equals("id")) {
					orderLook.setId(m.get(k));
				} else if (k.equals("ordernum")) {
					orderLook.setOrdernum(m.get(k));
				} else if (k.equals("code")) {
					orderLook.setCode(m.get(k));
				} else if (k.equals("state")) {
					if (m.get(k).equals(0)) {
						k = "已核销";
						System.out.println(k);
					} else {
						k = "未核销";
						System.out.println(k);
					}
					orderLook.setState(k);
				} 
			}
			System.out.println(orderLook);
			dataList1.add(orderLook);
		}
		int titleSize[] = {13, 13, 13, 13, 13};
		String titleColumn[] = {"id", "ordernum", "code", "state"};
		String titleName[] = { "编号", "订单编号", "核销码", "状态"};
		pee.setAddress("A:D"); // 自动筛选
		pee.wirteExcel(titleColumn, titleName, titleSize, dataList1);
		ServletOutputStream outputStream = resp.getOutputStream();
		resp.setHeader("Content-type", "application/vnd.ms-excel;charset=UTF-8");
		resp.setHeader("Content-Disposition", "attachment;filename=EventList.xls");
		FileInputStream fileInputStream = new FileInputStream("E:/订单核销表.xls");
		IOUtils.copy(fileInputStream, outputStream);
	}
}
