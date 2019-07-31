package com.util;

import com.vo.ResultVO;

/**
 * *********************************
* @ClassName: ResultVOUtil.java
* @Description: 返回工具类
* @author: Thread
* @createdAt: 2019年7月30日下午9:57:43
**********************************
 */
public class ResultVOUtil {
	
	public static ResultVO<?> success(Object object) {
		ResultVO<Object> resultVO = new ResultVO<>();
		resultVO.setData(object);
		resultVO.setStatus("0");
		resultVO.setMessage("成功");
		return resultVO;
	}
	
	
	public static ResultVO<?> success() {
		return success(null);
	}
	
	
	public static ResultVO<Void> error(String code, String msg) {
		ResultVO<Void> resultVO = new ResultVO<>();
		resultVO.setStatus(code);
		resultVO.setMessage(msg);
		return resultVO;
	}
}
