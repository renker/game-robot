package com.renker.game.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

/**
 * JSON 工具
 * @author renker
 * @date 2019年8月28日
 */
public class JsonUtil {
	
	/**
	 * JSON转对象
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static <T> T parseObject(String text,Class<T> clazz){
		return JSON.parseObject(text, clazz);
	}
	
	/**
	 * 对象转JSON
	 * @param object
	 * @return
	 */
	public static String toJSONString(Object object){
		return JSON.toJSONString(object);
	}
	
	/**
	 * 对象转JSON 支持泛型
	 * @param text
	 * @param type
	 * @return
	 */
	public static <T> T parseObject(String text,TypeReference<T> type){
		return JSON.parseObject(text, type);
	}
	
}
