package org.xjh.spring.springLearn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("org.xjh.spring.springLearn.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
