package com.learn1.selfAnnotat;

import java.util.List;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName Person
 * @Author dwj
 * @Date 2022/2/17 9:44
 * @Version 1.0
 */
@Component
public class Person {
	private String name;
	private int age=11;
	private List<String> likes;

	public Person(String name) {
		this.name = name;
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

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}
}
