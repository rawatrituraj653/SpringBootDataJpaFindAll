package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.st.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired	
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//get all records
		//repo.findAll().forEach(System.out::println);
		//get all records based on sorting order
		//repo.findAll(Sort.by(Direction.DESC,"prodName")).forEach(System.out::println);
		//repo.findAll(Sort.by(Direction.ASC,"prodName")).forEach(System.out::println);
		
		//get all record with pagination
		//PageRequest p=PageRequest.of(1, 3);
		PageRequest p=PageRequest.of(2, 2);
		repo.findAll(p).forEach(System.out::println);
	}

}
