package com.learn1.selfTag.selLookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName Dog
 * @Author dwj
 * @Date 2022/1/5 11:10
 * @Version 1.0
 */
@Component
public class Dog {
	@Autowired
	private Fruit apple;

	public void show(){
		apple.show();
	}
}
