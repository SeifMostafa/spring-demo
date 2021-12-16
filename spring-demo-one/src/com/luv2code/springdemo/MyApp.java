package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
				
		// retrieve bean from spring container
		TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());

		
		TrackCoach theCoachNumber2 = context.getBean("myCoach", TrackCoach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		
		
		System.out.println(theCoach);
		System.out.println(theCoachNumber2);
		
		System.out.println(theCoach.getFortuneService());
		System.out.println(theCoachNumber2.getFortuneService());
		
		
		// close the context
		context.close();
	}

}
