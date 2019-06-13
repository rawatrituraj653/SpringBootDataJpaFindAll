package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.st.entity.Product;
import com.st.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired	
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//1.get all records
		//repo.findAll().forEach(System.out::println);
		
		//2.get all records based on sorting order
		//repo.findAll(Sort.by(Direction.DESC,"prodName")).forEach(System.out::println);
		//repo.findAll(Sort.by(Direction.ASC,"prodName")).forEach(System.out::println);
		
		//3.get all record with pagination
		//PageRequest p=PageRequest.of(1, 3);
		//PageRequest p=PageRequest.of(2, 2);
		//repo.findAll(p).forEach(System.out::println);
		
		//4.get all record based on condition
		/*
		 * Product p=new Product(); 
		 * p.setProdCost(11.3); 
		 * p.setProdId(108);
		 * Example<Product> pobj=Example.of(p);
		 * repo.findAll(pobj).forEach(System.out::println);
		 */
		
		// 5.get all Product By Id like In clause
		//repo.findAllById(Arrays.asList(110,103,104,105)).forEach(System.out::println);	
		
		/* Product p=new Product(); 
		  p.setProdCost(11.3); 
		  Example<Product> pobj=Example.of(p);
		  PageRequest page=PageRequest.of(0, 3);
		repo.findAll(pobj, page).forEach(s->System.out.println(s));
*/
		 Product p=new Product(); 
		  p.setProdCost(11.3); 
		  Example<Product> pobj=Example.of(p);
		repo.findAll(pobj, Sort.by(Direction.DESC,"prodId")).forEach(s->System.out.println(s));
	}
}
