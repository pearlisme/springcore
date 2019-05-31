package com.pearl.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
//@EnableAsync
//@ComponentScan("com.pearl.spring")
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

//	@Bean(name="processExecutor")
//	public TaskExecutor workExecutor() {
//		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//		threadPoolTaskExecutor.setThreadNamePrefix("Async-");
//		threadPoolTaskExecutor.setCorePoolSize(3);
//		threadPoolTaskExecutor.setMaxPoolSize(3);
//		threadPoolTaskExecutor.setQueueCapacity(600);
//		threadPoolTaskExecutor.afterPropertiesSet();
//
//		return threadPoolTaskExecutor;
//	}

}
