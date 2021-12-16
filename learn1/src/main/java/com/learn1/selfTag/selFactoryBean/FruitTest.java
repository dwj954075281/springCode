package com.learn1.selfTag.selFactoryBean;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName FruitTest
 * @Author dwj
 * @Date 2021/12/7 16:06
 * @Version 1.0
 */
@Component
public class FruitTest {
	@Autowired
	private FruitTest2 fruitTest2;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	public void show(){
//		System.out.println(getObject());
//	}
//
//
//	@Lookup("&myFactoryBean")
//	public MyFactoryBean getObject(){
//		return null;
//	}
}
