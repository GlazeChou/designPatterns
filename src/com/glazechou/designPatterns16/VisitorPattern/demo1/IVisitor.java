package com.glazechou.designPatterns16.VisitorPattern.demo1;

public interface IVisitor {
 
	public void visit(CommonEmployee commonEmployee);
	
	public void visit(Manager manager);
}
