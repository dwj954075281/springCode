package com.learn1.factoryBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 *
 * @ClassName Test
 * @Author dwj
 * @Date 2022/4/25 11:44
 * @Version 1.0
 */
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");

		System.out.println(context.getBean("myFactoryBean"));
		System.out.println(context.getBean("&myFactoryBean"));
	}
}
