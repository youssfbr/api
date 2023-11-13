package com.github.youssfbr.api;

import com.github.youssfbr.api.entities.Department;
import com.github.youssfbr.api.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Department d1 = new Department(1L, "Tech");
		Department d2 = new Department(2L, "Pet");

		Product p1 = new Product(1L, "Macbook Pro" , 4000.0 , d1);
		Product p2 = new Product(2L, "PC Gamer" , 5000.0 , d1);
		Product p3 = new Product(3L, "Pet House" , 300.0 , d2);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}
}
