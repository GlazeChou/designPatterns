package com.glazechou.designPatterns16.VisitorPattern.base;

/**
 * 抽象访问者
 * @author msi-
 *
 */
public interface IVisitor {
  
	//可以访问哪些对象
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
	
}
