package com.task;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;

import com.vo.ResultVO;
import com.vo.ResultVOUtil;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * *********************************
* @ClassName: DealDataTask.java
* @Description: 线程处理数据
* @author: Thread
* @createdAt: 2019年7月30日下午9:32:09
**********************************
 */
@Data
@AllArgsConstructor
public class DealErrorDataTask implements Callable<ResultVO<?>> {
	/*
	 * 数据集合
	 */
	private List<String[]> listData = new Vector<>();
	
	/*
	 * 批次号
	 */
	private Long batchId;

	@Override
	public ResultVO<?> call() {
		return ResultVOUtil.success();
	}
	
}
