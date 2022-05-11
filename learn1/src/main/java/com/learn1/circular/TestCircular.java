package com.learn1.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * <br>
 *
 * @ClassName TestCircular
 * @Author dwj
 * @Date 2022/4/25 15:15
 * @Version 1.0
 */

public class TestCircular {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationTest.class);


	}
}
