package com.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.memory.MemoryErrorUtil;
import com.template.SqlTemplate;
import com.util.CsvUtil;

/**
 * *********************************
* @ClassName: ExecutorsUtil.java
* @Description: 线程池工具类
* @author: Thread
* @createdAt: 2019年7月30日下午9:27:33
**********************************
 */
public class ExecutorsErrorUtil {
	
	public static void start() {
		ScheduledExecutorService singleExe = Executors.newSingleThreadScheduledExecutor();
		singleExe.execute(new Runnable() {
			@Override
			public void run() {
				// 处理数据队列
				BlockingQueue<String[]> dataErrorQueue = MemoryErrorUtil.instance.dataErrorQueue;
				if (dataErrorQueue != null && dataErrorQueue.size() > 0) {
					List<String[]> errorData = new ArrayList<>();
					// 生成错误csv文件
					while (dataErrorQueue.size() > 0) {
						errorData.add(dataErrorQueue.poll());
					}
					CsvUtil.generatorCsv(errorData, SqlTemplate.tableName + "Error" + ".csv", SqlTemplate.sqlColumns);
				}
				
				System.out.println("生成CSV文件成功");
			}
		});
		
		singleExe.shutdown();
	}
}
