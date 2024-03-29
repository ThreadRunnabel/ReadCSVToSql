package com.task;

import java.util.List;
import java.util.concurrent.Callable;

import com.memory.MemoryErrorUtil;
import com.template.SqlTemplate;
import com.util.ResultVOUtil;
import com.vo.ResultVO;

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
public class DealDataTask implements Callable<ResultVO<?>> {
	/*
	 * 数据集合
	 */
	private List<String[]> listData;
	
	/*
	 * 批次号
	 */
	private Long batchId;

	@Override
	public ResultVO<?> call() {
		String[] headers = SqlTemplate.sqlColumns;
		// 拼接SQL语句
		
		 // 测试错误数据
//		int i = 1;
		for (String[] stringArray : listData) {
			try{
				StringBuilder sb = new StringBuilder();
				sb.append("insert into ").append(SqlTemplate.tableName).append("(");
				for (String header : headers) {
					sb.append("`").append(header).append("`").append(",");
				}
				sb = sb.replace(sb.length() - 1, sb.length(), "");
				sb.append(") values (");
	            for (String content : stringArray) {
	            	sb.append("\"").append(content).append("\"").append(",");
	            }
                sb = sb.replace(sb.length() - 1, sb.length(), "");
                sb.append(");");
              
//                // 测试错误数据
//                if (i % 2 == 1) {
//	                int a = 1/0;
//                }
               
                System.out.println(sb.toString());
			} catch (Exception e){
				MemoryErrorUtil.instance.addDataQueue(stringArray);
			}
//			i++;
		}
		return ResultVOUtil.success();
	}
	
}
