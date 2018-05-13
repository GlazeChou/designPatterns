package com.glazechou.designPatterns16.VisitorPattern.demo1;

public class Manager extends Employee {
   
	private String performance;  //业绩
	
	public Manager() {};
	
	public Manager(String name,int salary ,int sex,String performance) {
		super(name,salary,sex);
		this.performance = performance;
	}
	
	
	protected String getOtherInfo() {
		return "工作："+ this.performance + "\t";
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	//允许的访问者
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
