package com.learn1.selfTag.selFactoryBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName MyFractoryBean
 * @Author dwj
 * @Date 2021/12/7 14:48
 * @Version 1.0
 */
@Component
public  class MyFactoryBean implements FactoryBean<Fruit> {
	private  int count=0;

	private Class<?> myObjectTpye;

	private ApplicationContext ac;

	@Override
	public Fruit getObject() throws Exception {
		count++;
		this.myObjectTpye=Banner.class;
		return new Banner();
	}

	@Override
	public Class<?> getObjectType() {
		return this.myObjectTpye;
	}


}
