package org.xjh.spring.springLearn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.xjh.spring.springLearn")
@PropertySource({"classpath:jdbc.properties"})
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
