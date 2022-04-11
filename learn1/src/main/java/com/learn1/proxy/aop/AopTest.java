package com.learn1.proxy.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 *
 * @ClassName AopTest
 * @Author dwj
 * @Date 2022/1/10 16:44
 * @Version 1.0
 */
public class AopTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("aop.xml");
		Order orderService = (Order) ctx.getBean("orderService");
		orderService.pay(123);
		//BeanFactoryPostProcessor bfp=beanFactory ->{}

	}
}
