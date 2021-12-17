package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes doing Abs workout";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

//	@Autowired
//	@Qualifier("happyFortuneService")
//	public BaseballCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
	
}
