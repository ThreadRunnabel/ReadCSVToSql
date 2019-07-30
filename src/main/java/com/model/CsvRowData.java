package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * *********************************
* @ClassName: CsvRowData.java
* @Description: CSV数据对象
* @author: Thread
* @createdAt: 2019年7月30日下午6:15:55
**********************************
 */
@Data
@AllArgsConstructor
public class CsvRowData {
	/*
	 * 数据id
	 */
	private Long id;
	/*
	 * 用户名
	 */
	private String name;
	/*
	 * 访问地址
	 */
	private String url;
	/*
	 * 描述
	 */
	private String describe;
	/*
	 * 权限id
	 */
	private Long auth;
	
	
}
