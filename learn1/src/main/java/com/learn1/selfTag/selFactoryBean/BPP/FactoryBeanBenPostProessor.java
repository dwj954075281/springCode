package com.learn1.selfTag.selFactoryBean.BPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName FactoryBeanBenPostProessor
 * @Author dwj
 * @Date 2021/12/9 10:27
 * @Version 1.0
 */
@Component
public class FactoryBeanBenPostProessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("FactoryBeanBenPostProessor postProcessBeforeInitialization+ beanName is " +bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("FactoryBeanBenPostProessor postProcessAfterInitialization+ beanName is " +bean);
		return bean;
	}
}
