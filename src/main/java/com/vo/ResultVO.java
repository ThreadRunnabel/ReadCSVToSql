package com.vo;

import lombok.Data;

/**
 * *********************************
* @ClassName: ResultVO.java
* @Description: 返回工具类
* @author: Thread
* @createdAt: 2019年7月30日下午9:56:23
**********************************
 */
@Data
public class ResultVO<T> {
	
	/*
	 * 响应码
	 */
	private String	status;
	
	/*
	 * 提示信息
	 */
	private String	message;
	
	/**
	 * 返回数据
	 */
	private T		data;
	
	/**
	 * 返回批次号
	 */
	private Long batchId;
}
