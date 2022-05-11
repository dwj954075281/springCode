package com.learn1.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName TestServiceA
 * @Author dwj
 * @Date 2022/4/25 15:16
 * @Version 1.0
 */
@Component
public class TestServiceA {
	private String naem;
	private Integer age;

	@Autowired
	private TestServiceB testServiceB;

	@Async
	public void test(){
		System.out.println("啛啛喳喳");
	}

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
