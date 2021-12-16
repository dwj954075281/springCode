package com.learn1.postPorcessor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * <br>
 *
 * @ClassName BeanPostProcessorTest
 * @Description TODO
 * @Author 邓文杰
 * @Date 2020/12/15 11:06
 * @Version 1.0
 */
public class BeanPostProcessorTest implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean [" + beanName + "] 开始初始化");
		// 这里一定要返回 bean，不能返回 null
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean [" + beanName + "] 完成初始化");
		return bean;
	}

	public void display(){
		System.out.println("hello BeanPostProcessor!!!");
	}
}
