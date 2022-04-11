package com.learn1.proxy.jdk;

import java.util.Properties;
import org.junit.Test;

/**
 * <br>
 * jdk动态代理的步骤：
 * 1.首先创建一个对应的接口
 * 2.一个具体的实现类
 * 3.创建一个生成代理类的类，其中添加需要切入的内容
 *
 * jdk动态代理只能讲代理强转为接口，然后通过接口调用，调用到具体的代理targetClass对象的接口实现方法；
 * 当需要调用类本身的私有方法（未通过接口来抽象）时，是不能完成代理的
 * @ClassName JdkProxyTest
 * @Author dwj
 * @Date 2022/1/5 20:57
 * @Version 1.0
 */
public class JdkProxyTest {


	@Test
	public void test1(){

		Animal proxy =  AnimalProxy.getProxy(new Dog());
		proxy.eat();
		proxy.show();
	}

	public static void main(String[] args) {

		JdkProxy jdkProxy = new JdkProxy();
		Animal proxy = (Animal) jdkProxy.getProxy(new Cat());
		proxy.show();

	}
}
