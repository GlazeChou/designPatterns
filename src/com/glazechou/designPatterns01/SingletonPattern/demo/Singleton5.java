/**
 * 
 */
package com.glazechou.designPatterns01.SingletonPattern.demo;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年6月5日
 * 
 *             第五种 静态内部类
 */
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	};

	public static Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
