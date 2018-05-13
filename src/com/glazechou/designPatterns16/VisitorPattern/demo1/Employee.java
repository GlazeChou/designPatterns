package com.glazechou.designPatterns16.VisitorPattern.demo1;

/**
 * 抽象员工
 * 
 * @author msi-
 *
 */
public abstract class Employee {

	public final static int MALE = 0; // 0代表男性
	public final static int FEMALE = 1; // 1代表女性

	private String name; // 名字
	private int Salary; // 薪资
	private int sex; // 性别

	public Employee() {};
	
	public Employee(String name, int salary, int sex) {
	    this.name = name;
	    this.Salary = salary;
	    this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
	public abstract void accept(IVisitor visitor);

}
	/**
	 * 打印员工信息
	 */
    /* public final void report() {
    	 String info = "姓名：" + this.name +"\t" ;
    	 info = info + "性别：" + (this.sex==FEMALE ? "女":"男") + "\t";
    	 info = info + "薪资：" + this.Salary + "\t";
    	 info = info + this.getOtherInfo();
    	 System.out.println(info);
     }*/
     
     /**
      * 拼装员工其他信息
      */
//     protected abstract String getOtherInfo();
	
