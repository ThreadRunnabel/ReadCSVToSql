package com;

import com.task.ExecutorsUtil;
import com.util.CsvUtil;

/**
 * *********************************
* @ClassName: Application.java
* @Description: 启动类
* @author: Thread
* @createdAt: 2019年7月30日下午6:15:55
**********************************
 */
public class Application {
	
	public static void main(String[] args) {
		// 读取测试数据
		CsvUtil.readCSV(Application.class.getClassLoader().getResource("test2.csv").getPath(), 10);
		
		// 线程池
		ExecutorsUtil.start();
	}
}
