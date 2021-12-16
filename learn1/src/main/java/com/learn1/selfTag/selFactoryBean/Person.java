package com.learn1.selfTag.selFactoryBean;

import com.learn1.selfTag.selLookup.Apple;
import com.learn1.selfTag.selLookup.Banner;
import com.learn1.selfTag.selLookup.Fruit;
import org.springframework.beans.BeansException;
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

public abstract class Person {

	public void show() throws Exception {
		System.out.println(getObject().getObject());
	}

	@Lookup("&myFactoryBean")
	public MyFactoryBean getObject(){
		return null;
	}


}
