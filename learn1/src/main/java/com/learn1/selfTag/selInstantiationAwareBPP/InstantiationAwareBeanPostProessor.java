package com.learn1.selfTag.selInstantiationAwareBPP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 *
 * @ClassName InstantiationAwareBeanPostProessor
 * @Author dwj
 * @Date 2021/12/8 11:08
 * @Version 1.0
 */
public class InstantiationAwareBeanPostProessor {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("instantiationAwareBpp.xml");


	}
}
