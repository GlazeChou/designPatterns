package com.glazechou.designPatterns16.VisitorPattern.demo1;

public class CommonEmployee extends Employee {
   
	private String job;  //工作
	
	public CommonEmployee() {};
	
	public CommonEmployee(String name,int salary,int sex,String job) {
		super(name,salary,sex);
		this.job = job;
	}
	
	
	protected String getOtherInfo() {
		return "工作："+ this.job + "\t";
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	//允许访问者访问
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
