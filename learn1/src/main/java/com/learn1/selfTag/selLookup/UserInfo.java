package com.learn1.selfTag.selLookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName UserInfo
 * @Author dwj
 * @Date 2021/12/7 11:33
 * @Version 1.0
 */
@Component
public class UserInfo {

	private String name;

	private String age ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
