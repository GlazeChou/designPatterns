package com.glazechou.designPatterns23.FlyweightPattern.demo1;

import java.util.HashMap;

public class SignInfoFactory {
   //池容器
	private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
	//报名信息工厂
	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}
	
	//从池中获取对象
	public static SignInfo getSignInfo(String key) {
		SignInfo result = null; //设置返回对象
		//池中没有该对象，则建立，放入池中
		if(!pool.containsKey(key)) {
			System.out.println(key + "---建立对象，并放入到池中");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		}else {
			result = pool.get(key);
			System.out.println(key + "---直接从池中取得");
		}
		return result;
	}
}
