package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		TrackCoach theCoach = context.getBean("trackCoach", TrackCoach.class);
		// call methods on the bean
		//System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());

		
		FootballCoach theCoachNumber2 = context.getBean("footballCoach", FootballCoach.class);
		// call methods on the bean
		//System.out.println(theCoachNumber2.getDailyFortune());
		System.out.println(theCoachNumber2.getDailyWorkout());

		
		
		System.out.println(theCoach);
		System.out.println(theCoachNumber2);
		
		System.out.println(theCoach.getFortuneService());
		System.out.println(theCoachNumber2.getFortuneService());
		
		
		// close the context
		context.close();
	}

}
