package org.xjh.spring.springLearn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.xjh.spring.springLearn")
@EnableAspectJAutoProxy
public class SpringConfig {
}
