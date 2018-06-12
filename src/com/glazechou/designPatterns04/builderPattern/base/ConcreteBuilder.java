/**
 * 
 */
package com.glazechou.designPatterns04.builderPattern.base;

/**
 * @author GlazeChou
 * 
 * @createTime 2018年6月13日  
 */
public class ConcreteBuilder extends Builder {

	private Product product = new Product();
    //设置产品零件
	public void setPart() {
       //产品类内的逻辑处理
	}
    //组建一个产品
 	public Product buildProduct() {
		return product;
	}

}
