package com.memory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * *********************************
* @ClassName: MemoryUtil.java
* @Description: 缓存工具类(实际项目中就是redis)
* @author: Thread
* @createdAt: 2019年7月30日下午6:34:50
**********************************
 */
public enum MemoryErrorUtil {
	instance;
	
	/*
	 * 需要处理的数据
	 */
	public BlockingQueue<String[]> dataErrorQueue = new LinkedBlockingQueue<>();
	
	
	/**
	 * 
	* @Title: addDataQueue
	* @Description: 把数据放进处理数据队列
	* @param i
	* @param data
	* @createdBy:Thread
	* @createaAt:2019年7月30日下午6:43:22
	 */
	public void addDataQueue(String[] error) {
		dataErrorQueue.offer(error);
	}
}
