package com.glazechou.designPatterns16.VisitorPattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		for (Employee emp : mockEmployee()) {
			//emp.report();
			emp.accept(new Visitor());
		}
		
	}
	
	//模拟出公司的人员情况
	public static List<Employee> mockEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		CommonEmployee zhangsan = new CommonEmployee();
		zhangsan.setName("张三");
		zhangsan.setSalary(8000);
		zhangsan.setSex(Employee.MALE);
		zhangsan.setJob("java程序员");
		list.add(zhangsan);
		
		CommonEmployee lisi = new CommonEmployee();
		lisi.setName("李四");
		lisi.setSalary(7500);
		lisi.setSex(Employee.MALE);
		lisi.setJob("前端");
		list.add(lisi);
		
		CommonEmployee laowang = new CommonEmployee();
		laowang.setName("老王");
		laowang.setSalary(7000);
		laowang.setSex(Employee.MALE);
		laowang.setJob("测试");
		list.add(laowang);
		
		Manager zhaoliu = new Manager("赵六",12000,Employee.MALE,"项目经理");
		list.add(zhaoliu);
		return list;
	}
}
