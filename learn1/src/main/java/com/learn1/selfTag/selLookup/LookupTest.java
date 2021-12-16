package com.learn1.selfTag.selLookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <br>
 *
 * @ClassName LookupTest
 * @Author dwj
 * @Date 2021/12/6 22:43
 * @Version 1.0
 */
public class LookupTest {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext("com.learn1.selfTag");
		Person bean = ac.getBean(Person.class);
		bean.show();
		bean.show();
		bean.show();
		bean.show();
		bean.show();

	}
}
