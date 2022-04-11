package com.learn1.selfTag.selLookup;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		ApplicationContext ctx=new ClassPathXmlApplicationContext("lookupTest.xml");



	}

	@Test
	public void annotationTest(){
		ApplicationContext ac=new AnnotationConfigApplicationContext("com.learn1.selfTag.selLookup");


	}
}
