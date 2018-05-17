/**
 * 
 */
package com.glazechou.designPatterns13.StatePattern.base;

/**
 * 环境角色有两个不成文的约束
 *    把状态对象声明为静态常量，有几个状态对象就声明几个静态常量
 *    环境角色具有抽象角色定义的所有行为，具体执行使用委托方式。
 * 
 * @author GlazeChou
 * 
 * @createTime 2018年5月17日  
 */
@SuppressWarnings("unused")
public class Context {
	//定义状态
	public final static State STATE1 = new ConcreteState1();
	public final static State  STATE2 = new ConcreteState2();
    
	//当前状态
	private State currentState;
	//获得当前状态
	public State getCurrentState() {
		return currentState;
	}
    //设置当前状态
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		//切换状态
		this.currentState.setContext(this);
	}
	//行为委托
	public void handle1() {
		this.currentState.handle1();
	}
	public void handle2() {
		this.currentState.handle2();
	}
}
