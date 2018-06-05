/**
 * 
 */
package com.glazechou.designPatterns01.SingletonPattern.demo;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年6月5日 
 * 
 *  第四种 俄汉，线程安全
 */
public class Singleton4 {
   private  static Singleton4 instance = new Singleton4();
   private Singleton4() {};
   public static synchronized Singleton4 getInstance() {
	   return instance;
   }
}
