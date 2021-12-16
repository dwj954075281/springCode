package com.learn1.selfTag.selFactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <br>
 *
 * @ClassName FactoryBeanTest
 * @Author dwj
 * @Date 2021/12/7 14:52
 * @Version 1.0
 */
public class FactoryBeanTest extends Object {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac=new AnnotationConfigApplicationContext("com.learn1.selfTag.selFactoryBean");
		Apple apple = (Apple) ac.getBean("apple");
		MyFactoryBean bean = ac.getBean(MyFactoryBean.class);
		System.out.println(ac.getBean("myFactoryBean"));
		System.out.println(ac.getBean("myFactoryBean"));
		FruitTest test=ac.getBean(FruitTest.class);
//		test.show();
//		test.show();
//		test.show();
//		Person bean = ac.getBean(Person.class);
//		bean.show();
//		bean.show();
//		bean.show();
	}
}
