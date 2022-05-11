package com.learn1.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName TestServiceB
 * @Author dwj
 * @Date 2022/4/25 15:16
 * @Version 1.0
 */
@Component
public class TestServiceB {
	private String naem;
	private Integer age;

	@Autowired
	private TestServiceA testServiceA;

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
