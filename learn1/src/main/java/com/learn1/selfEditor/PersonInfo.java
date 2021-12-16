package com.learn1.selfEditor;

/**
 * 人物信息
 *
 * @ClassName PersonInfo
 * @Author dwj
 * @Date 2021/11/22 16:35
 * @Version 1.0
 */
public class PersonInfo {
	private String name;
	private String sex;
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "PersonInfo{" +
				"name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}
