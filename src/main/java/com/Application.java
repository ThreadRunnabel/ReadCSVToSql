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
		// args[0] 是资源目录下的文件名
		if (args.length == 0) {
			args = new String[1];
			args[0] = "test.csv";
		}
		
		// 读取测试数据
		CsvUtil.readCSV(Application.class.getClassLoader().getResource(args[0]).getPath(), 5000);
		
		// 线程池
		ExecutorsUtil.start();
	}
}
