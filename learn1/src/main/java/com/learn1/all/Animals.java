package com.learn1.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName Animals
 * @Author dwj
 * @Date 2022/5/3 10:38
 * @Version 1.0
 */
@Component
public class Animals {

	private Boolean sex;

	@Autowired
	private Person person;

	public Animals(Boolean sex, Person person) {
		this.sex = sex;
		this.person = person;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
