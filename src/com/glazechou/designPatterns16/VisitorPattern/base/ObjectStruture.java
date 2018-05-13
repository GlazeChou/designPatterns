package com.glazechou.designPatterns16.VisitorPattern.base;

import java.util.Random;

public class ObjectStruture {

	//对象生成器，这里通过一个工厂方法模式模拟
	public static Element createElement() {
		Random random = new Random();
		if(random.nextInt(100)>50) {
			return new ConcreteElement1();
		}else {
			return new ConcreteElement2();
		}
	}
}
