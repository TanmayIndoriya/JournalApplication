package com.demo.Journal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JournalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JournalApplication.class, args);
	}

	@Bean
	public PlatformTransactionManager manage(MongoDatabaseFactory dbFactory){
		return new MongoTransactionManager(dbFactory);
	}

}
