package com.jpaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jpaDemo.repo.FileFormatRepo;

@EnableTransactionManagement
@EnableJpaRepositories
@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	@Autowired
	private FileFormatRepo ffRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO Auto-generated method stub
		System.out.println(ffRepo.findAll());
	}

}
