package org.tnsif.springweb;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringwebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringwebApplication.class, args);
		ConfigurableApplicationContext context=SpringApplication.run(SpringwebApplication.class, args);
		Scanner s=new Scanner(System.in);
		HomeController h=context.getBean(HomeController.class);
		h.home();
	}

}

