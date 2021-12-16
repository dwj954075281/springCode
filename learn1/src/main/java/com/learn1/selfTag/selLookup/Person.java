package com.learn1.selfTag.selLookup;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName Person
 * @Author dwj
 * @Date 2021/12/6 22:42
 * @Version 1.0
 */
@Component
public class Person implements ApplicationContextAware {

	private ApplicationContext ac;
	private int count;
	public void show(){
		System.out.println(getObject());
	}

	@Lookup
	public Fruit getObject(){
		count++;
		if(count>2){
			return this.ac.getBean(Banner.class);
		}
		return this.ac.getBean(Apple.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ac=applicationContext;
	}
}
