package com.example.dbfirsttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootApplication
public class DbFirstTestApplication {

//	@Bean
//	//@Transactional
//	public boolean demo(EntityManager entityManager
//	) {
//		//return (args) ->
//		//{
//		//log.info("demo: ");
//
//		//Order1 order = new Order1(ProdStatus.IN_STOCK);
//		//ordersRepo.save(order);
//	}


	public static void main(String[] args) {
		SpringApplication.run(DbFirstTestApplication.class, args);
	}

}
