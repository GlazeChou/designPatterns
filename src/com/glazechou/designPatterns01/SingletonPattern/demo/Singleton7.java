/**
 * 
 */
package com.glazechou.designPatterns01.SingletonPattern.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年6月5日
 * 
 *             第七种 登记式
 */
public class Singleton7 {
	// 类似Spring里面的方法，将类名注册，下次从里面直接获取。
		private static Map<String, Singleton7> map = new HashMap<String, Singleton7>();
		static {
			Singleton7 single = new Singleton7();
			map.put(single.getClass().getName(), single);
		}

		// 保护的默认构造子
		protected Singleton7(){}

		// 静态工厂方法,返还此类惟一的实例
		public static Singleton7 getInstance(String name) {
			if (name == null) {
				name = Singleton7.class.getName();
				System.out.println("name == null" + "--->name=" + name);
			}
			if (map.get(name) == null) {
				try {
					map.put(name, (Singleton7) Class.forName(name).newInstance());
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			return map.get(name);
		}

		// 一个示意性的商业方法
		public String about() {
			return "Hello, I am RegSingleton.";
		}

		public static void main(String[] args) {
			Singleton7 single7 = Singleton7.getInstance(null);
			System.out.println(single7.about());
		}
}
