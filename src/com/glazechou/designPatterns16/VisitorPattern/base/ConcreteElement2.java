package com.glazechou.designPatterns16.VisitorPattern.base;

/**
 * 具体元素2
 * @author msi-
 *
 */
public class ConcreteElement2 extends Element {

	//完善业务逻辑
	public void doSomething() {
      //业务处理
	}

	public void accept(IVisitor visitor) {
         visitor.visit(this);
	}

}
