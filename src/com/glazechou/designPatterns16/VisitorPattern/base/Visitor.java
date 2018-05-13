package com.glazechou.designPatterns16.VisitorPattern.base;

/**
 * 具体访问者
 * @author msi-
 *
 */
public class Visitor implements IVisitor {

	//访问el1元素
	@Override
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}

	//访问el2元素
	@Override
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}

}
