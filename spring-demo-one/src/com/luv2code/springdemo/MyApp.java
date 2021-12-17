package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		Coach theCoachNumber2 = context.getBean("footballCoach", Coach.class);

//		System.out.println(theCoach.getFortuneService());

		// close the context
		context.close();
	}

}
