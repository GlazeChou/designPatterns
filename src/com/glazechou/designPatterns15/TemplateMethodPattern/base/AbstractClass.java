/**
 * 
 */
package com.glazechou.designPatterns15.TemplateMethodPattern.base;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年5月30日  
 */
public abstract class AbstractClass {
   //基本方法
	protected abstract void doSomething();
	//基本方法
	protected abstract void doAnything();
	//模板方法
	public void templateMethod() {
		/**
		 * 调用基本方法，完成相关的逻辑
		 */
		this.doAnything();
		this.doSomething();
	}
}
