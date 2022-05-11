package com.learn1.all;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName Person
 * @Author dwj
 * @Date 2022/5/3 10:37
 * @Version 1.0
 */
@Component
public class Person {
	private int id=1;
	private String name;
	private Map<String,String > map;
	private List<String> list;
	@Autowired
	private Animals an;

	public Person(Animals an) {
		this.an = an;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Animals getAn() {
		return an;
	}

	public void setAn(Animals an) {
		this.an = an;
	}
}
