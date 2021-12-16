package com.learn1.config;

import com.learn1.pojo.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <br>
 *
 * @ClassName AppConfig
 * @Description TODO
 * @Author 邓文杰
 * @Date 2020/11/18 9:04
 * @Version 1.0
 */
@Configuration
public class AppConfig {

	@Bean
	public Cat cat(){
		return new Cat();
	}
}
