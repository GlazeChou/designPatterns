package com.glazechou.designPatterns01.SingletonPattern.base;

public class Singleton {
  private static final Singleton singleton = new Singleton();
  //限制产生多个对象
  private Singleton() {};
  //获得实例
  public static Singleton getSingleton() {
	  return singleton;
  }
  //类中其他方法，尽量是是staic
  public static void doSomething() {
	  
  }
}
