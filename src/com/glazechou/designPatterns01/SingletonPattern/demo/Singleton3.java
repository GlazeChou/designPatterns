/**
 * 
 */
package com.glazechou.designPatterns01.SingletonPattern.demo;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年6月5日
 * 
 *             第三种 懒汉，线程安全 双重校验锁
 */
public class Singleton3 {
	private static volatile Singleton3 instance;

	private Singleton3() {
	};

	public static Singleton3 getInstance() {
		if (instance == null) {
			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
