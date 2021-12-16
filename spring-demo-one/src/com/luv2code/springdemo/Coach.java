package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public interface Coach {

	public String getDailyWorkout();
	
	public String getDailyFortune();
}
