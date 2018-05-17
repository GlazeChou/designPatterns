/**
 * 
 */
package com.glazechou.designPatterns13.StatePattern.base;

/**场景类
 * 
 * @author GlazeChou
 * 
 * @createTime 2018年5月17日  
 */
public class Client {
    public static void main(String[] args) {
		//定义环境角色
    	Context context = new Context();
    	//初始化状态
    	context.setCurrentState(new ConcreteState1());
    	//行为执行
    	context.handle1();
    	context.handle2();
	}
    
    /**
     * 我们隐藏了状态的变化过程，它的切换引起了行为的变化。对外来说，我们只看到行为的变化，而不用知道是状态变化引起的
     */
}
