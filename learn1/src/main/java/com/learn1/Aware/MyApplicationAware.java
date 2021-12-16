package com.learn1.Aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <br>
 *
 * @ClassName MyApplicationAware
 * @Description Aware感知，spring在初始化时，会检测bean是否实现了Aware接口，
 *                然后可以通过回调bean的实现方法（setXXX）来设置对应的属性值，
 *               从而实现对bean类属性的特殊扩展。
 * @Author 邓文杰
 * @Date 2020/12/15 10:55
 * @Version 1.0
 */
public class MyApplicationAware implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, ApplicationContextAware {

	 private String beanName;

	private BeanFactory beanFactory;

	private ClassLoader classLoader;

	private ApplicationContext applicationContext;

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("调用了 BeanClassLoaderAware 的 setBeanClassLoader 方法");

		this.classLoader = classLoader;

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用了 BeanFactoryAware 的 setBeanFactory 方法");

		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("调用了 BeanNameAware 的 setBeanName 方法");

		this.beanName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("调用了 ApplicationContextAware 的 setApplicationContext 方法");

		this.applicationContext = applicationContext;
	}

	public void display(){
		System.out.println("beanName:" + beanName);

		System.out.println("是否为单例：" + beanFactory.isSingleton(beanName));

		System.out.println("系统环境为：" + applicationContext.getEnvironment());
	}
}
