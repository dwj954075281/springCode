package com.learn1.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * <br>
 *
 * @ClassName MyFactoryBean
 * @Author dwj
 * @Date 2022/4/25 11:42
 * @Version 1.0
 */
public class MyFactoryBean implements FactoryBean<TestBean> {
	@Override
	public TestBean getObject() throws Exception {
		return new TestBean();
	}

	@Override
	public Class<?> getObjectType() {
		return TestBean.class;
	}

}
