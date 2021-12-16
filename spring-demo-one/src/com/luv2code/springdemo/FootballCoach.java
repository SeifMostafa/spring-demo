package com.luv2code.springdemo;

public class FootballCoach implements Coach{
	
	private FortuneService fortuneService;

	public String getDailyWorkout() {
		return "Pass 30 in center";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
}
