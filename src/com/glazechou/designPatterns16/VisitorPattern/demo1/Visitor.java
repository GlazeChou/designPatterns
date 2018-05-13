package com.glazechou.designPatterns16.VisitorPattern.demo1;

public class Visitor implements IVisitor {

	//访问普通员工，打印普通员工报表
	@Override
	public void visit(CommonEmployee commonEmployee) {
           System.out.println(this.getCommonEmployee(commonEmployee));
	}

	//访问部门经理，打印部门经理报表
	@Override
	public void visit(Manager manager) {
           System.out.println(this.getMangerInfo(manager));
	}

	//组装基本信息
	private String getBasicInfo(Employee employee) {
		StringBuffer info = new StringBuffer();
		info.append("姓名："+employee.getName()+"\t");
		info.append("性别："+(employee.getSex()==Employee.FEMALE?"女":"男")+"\t");
		info.append("薪资："+employee.getSalary()+"\t");
		return info.toString();
	}
	
	//组装部门经理信息
	private String getMangerInfo(Manager manager) {
		StringBuffer info = new StringBuffer();
		info.append(this.getBasicInfo(manager));
		info.append("业绩："+manager.getPerformance());
		return info.toString();
	}
	
	//组装普通员工的信息
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		StringBuffer info = new StringBuffer();
		info.append(this.getBasicInfo(commonEmployee));
		info.append("工作："+commonEmployee.getJob());
		return info.toString();
	}
}
