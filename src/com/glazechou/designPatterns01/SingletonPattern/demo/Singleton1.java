/**
 * 
 */
package com.glazechou.designPatterns01.SingletonPattern.demo;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年6月5日 
 * 
 *  第一种 懒汉，线程不安全
 */
public class Singleton1 {
   private  static Singleton1 instance;
   private Singleton1() {};
   public static Singleton1 getInstance() {
	   if(instance == null ) {
		   instance = new Singleton1();
	   }
	   return instance;
   }
}
