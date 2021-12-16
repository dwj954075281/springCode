package com.learn1.selfTag.selFactoryBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName FruitTest2
 * @Author dwj
 * @Date 2021/12/8 21:42
 * @Version 1.0
 */
@Component
public class FruitTest2 {
	@Autowired
	private FruitTest fruitTest;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
