package com.learn1.all;

import com.learn1.circular.ConfigurationTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 *
 * @ClassName TestCircular
 * @Author dwj
 * @Date 2022/4/25 15:15
 * @Version 1.0
 */

public class TestAll {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("all.xml");


	}
}
