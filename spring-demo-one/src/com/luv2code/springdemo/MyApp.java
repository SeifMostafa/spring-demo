package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.luv2code.springdemo")
public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyApp.class);
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		Coach theCoachNumber2 = context.getBean("footballCoach", Coach.class);

//		System.out.println(theCoach.getFortuneService());

		// close the context
		context.close();
	}

}
