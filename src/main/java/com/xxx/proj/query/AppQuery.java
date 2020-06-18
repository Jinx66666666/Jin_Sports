package com.xxx.proj.query;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AppQuery {

	private int pageNo; // app显示的总页码数
	private int pageSize;// 一页数量
	private int count; /// 总数量

	public int getPageSize() {
		return pageSize * pageNo; // 返回分页查询的 总数量
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
