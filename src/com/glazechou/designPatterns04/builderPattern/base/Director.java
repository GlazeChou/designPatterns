/**
 * 
 */
package com.glazechou.designPatterns04.builderPattern.base;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年6月13日  
 */
public class Director {
    private Builder builder = new ConcreteBuilder();
    //构建不同的产品
    public Product getAProduct() {
    	builder.setPart();
    	//设置不同的零件，产生不同的产品
    	return builder.buildProduct();
    }
}
