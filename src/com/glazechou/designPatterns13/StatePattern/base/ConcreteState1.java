/**
 * 
 */
package com.glazechou.designPatterns13.StatePattern.base;

import java.util.List;

/**
 * @author GlazeChou
 * @createTime 2018年5月17日  
 */
public class ConcreteState1 extends State{

	@Override
	public void handle1() {
		//本状态下必须处理的逻辑
	}

	@Override
	public void handle2() {
		//设置当前状态为stat2
		super.context.setCurrentState(Context.STATE2);
		//过渡到state2，由Context实现
		super.context.handle2();
	}
}
