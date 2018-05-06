package com.glazechou.designPatterns02.factoryMethodPattern.base;

/**
 * ���󹤳���
 * @author msi-
 *
 */
public abstract class Creator {
   /**
    * ����һ����Ʒ����������������Ϳ�����������
    * ͨ��ΪString��Enum��Class�ȣ���ȻҲ����Ϊ��
    */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
