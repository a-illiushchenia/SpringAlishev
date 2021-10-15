package com.illiushchenia.javaCodeConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.illiushchenia.javaCodeConfiguration")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
