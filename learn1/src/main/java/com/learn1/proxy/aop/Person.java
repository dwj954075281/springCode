package com.learn1.proxy.aop;

/**
 * <br>
 *
 * @ClassName Person
 * @Author dwj
 * @Date 2022/4/19 14:22
 * @Version 1.0
 */
public class Person {
	private String name;
	private int age;



	public Person(String name) {
		this.name = name;
	}
	public Person( ) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
