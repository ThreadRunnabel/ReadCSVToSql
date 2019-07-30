package com.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import com.memory.MemoryUtil;
import com.vo.ResultVO;

/**
 * *********************************
* @ClassName: ExecutorsUtil.java
* @Description: 线程池工具类
* @author: Thread
* @createdAt: 2019年7月30日下午9:27:33
**********************************
 */
public class ExecutorsUtil {
	/*
	 * 处理数据线程
	 */
	private static ExecutorService exe = null;
	/*
	 * 数据返回集合
	 */
	private static List<FutureTask<ResultVO<?>>> listFuture = new ArrayList<FutureTask<ResultVO<?>>>();
	
	
	
	public static void init() {
		// 处理数据线程持
		exe = Executors.newFixedThreadPool(4);
		
		// 启动单线程执行
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 处理数据队列
				BlockingQueue<Map<Long, List<String[]>>> dataQueue = MemoryUtil.instance.dataQueue;
				if (dataQueue != null && dataQueue.size() > 0) {
					dataQueue.stream().forEach(n -> {
						for (Map.Entry<Long, List<String[]>> entry: n.entrySet()) {
							List<String[]> value = entry.getValue();
							Long key = entry.getKey();
							FutureTask<ResultVO<?>> futureTask = new FutureTask<>(new DealDataTask(value, key));
							listFuture.add(futureTask);
							exe.submit(futureTask);
						}
					});
				}
				
				// 判断线程池是否执行完
				waitDeal();
				
				// 关闭线程池
				exe.shutdown();
			}
		}).start();
	}
	
	/**
	 * 
	* @Title: isOver
	* @Description: 判断线程池是否执行完
	* @return
	* @createdBy:Thread
	* @createaAt:2019年7月30日下午9:43:34
	 */
	private static void waitDeal() {
		// 循环获取数据
        int time = 0;
		while (listFuture.size() > 0){
			// 判断数据是否成功
            for (Iterator<FutureTask<ResultVO<?>>> it = listFuture.iterator(); it.hasNext();){
            	FutureTask<ResultVO<?>> futureTask = it.next();
                if (futureTask.isDone()){
                    try{
                        it.remove();
                    } catch (Exception e){
                    	e.printStackTrace();
                    }
                }
            }
            
            // 线程等待时间加长
            if (listFuture.size() > 0){
                try{
                    time = time + 3;
                    if (listFuture.size() > 600){
                        time = time + 10;
                    }
                    Thread.sleep(time);
                } catch (InterruptedException e){
                	e.printStackTrace();
                }
            }
        }
	}
}
