package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	public String getDailyWorkout() {
		return "spend 30 minutes doing Abs workout";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
}
