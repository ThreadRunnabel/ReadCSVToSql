package com.util;

/**
 * *********************************
* @ClassName: Monitoring.java
* @Description: 用于显示执行时间的辅助类
* @author: Thread
* @createdAt: 2019年7月31日上午8:26:02
**********************************
 */
public class Monitoring {
    private static ThreadLocal<Long> begin = new ThreadLocal<Long>();
    
    
    public static void begin() {
        begin.set(System.currentTimeMillis());
    }
    
    
    public static void end(String name) {
        double time = (System.currentTimeMillis() - begin.get()) / 1000.0;
        System.out.println(name + "所用时间（秒）：" + time);
    }
}
