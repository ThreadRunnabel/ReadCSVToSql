package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.memory.MemoryUtil;
import com.template.SqlTemplate;

/**
 * *********************************
* @ClassName: CsvUtil.java
* @Description: CSV常用工具类
* @author: Thread
* @createdAt: 2019年7月30日下午6:05:54
**********************************
 */
public class CsvUtil {
	
	/**
	 * 
	* @Title: readCSV
	* @Description: 读取文件
	* @param readPath 文件路径
    * @param rowCount 每一次批次条数
	* @return
	* @author: Thread
	* @createdAt: 2019年7月30日下午6:05:54
	 */
    public static Boolean readCSV(String readPath, int rowCount) {
        String filePath = readPath;
        
        
        // 正确数据数组
        List<String[]> listData = new ArrayList<>();
        
        try {
        	// 获取表名
        	File file = new File(filePath);
        	String name = file.getName();
        	if (StringUtil.isNotBlank(name)) {
        		String[] tableName = name.split("\\.");
        		SqlTemplate.tableName = tableName[0];
        	}
        	
        	// 拿到文件操作对象
        	filePath = readPath;
            CsvReader csvReader = new CsvReader(filePath);
            
            // 读取表头
            boolean readHeaders = csvReader.readHeaders();
            if (readHeaders) {
            	String[] headers = csvReader.getHeaders();
            	SqlTemplate.sqlColumns = headers;
            } else {
            	throw new RuntimeException("获取文件表头失败");
            }
            
            // 批次计数器
            Long success = 1L;
            while (csvReader.readRecord()) {
            	// 进行正确数据，错误数据集合长度判断 分批次放进缓存
            	if (listData.size() != 0 && listData.size() % rowCount == 0) {
            		// 存放进缓存
            		MemoryUtil.instance.addDataQueue(success, listData);
            		// 清空数组
            		listData.clear();
            		success++;
            	}
            	// 数据处理
            	String rawRecord = csvReader.getRawRecord();
            	if (StringUtil.isBlank(rawRecord)) {
            		break;
            	}
            	String[] data = rawRecord.split(Constants.COMMA);
            	
            	// 如果验证不通过就证明是脏数据,记录下来即可
            	listData.add(data);
            }
            
            if (listData.size() > 0) {
        		// 存放进缓存
        		MemoryUtil.instance.addDataQueue(success, listData);
        		// 清空数组
        		listData.clear();
        		success++;
        	}
            
            return Boolean.TRUE;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件不存在");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } 

    }
}
