package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import lifecycle.HRService;

@ComponentScan(basePackages = {"lifecycle"})
public class Main {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		HRService hrService = context.getBean(HRService.class);
		hrService.processPayroll();
		System.out.println("---------------");
		context.close();
	}
}
