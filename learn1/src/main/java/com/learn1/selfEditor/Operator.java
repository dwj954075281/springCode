package com.learn1.selfEditor;

/**
 * 操作员信息
 *
 * @ClassName Operator
 * @Author dwj
 * @Date 2021/11/22 16:48
 * @Version 1.0
 */
public class Operator {
	private String id;
	private PersonInfo personInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	@Override
	public String toString() {
		return "Operator{" +
				"id='" + id + '\'' +
				", personInfo=" + personInfo +
				'}';
	}
}
