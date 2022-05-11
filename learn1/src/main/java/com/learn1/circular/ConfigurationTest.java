package com.learn1.circular;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @ClassName ConfigurationTest
 * @Author dwj
 * @Date 2022/4/25 16:21
 * @Version 1.0
 */
@Configuration
@EnableAsync
@ComponentScan("com.learn1.circular")
public class ConfigurationTest {
}
