package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	private HappyFortuneService fortuneService;
	private String emailAddress, team;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 10 minutes running";
	}
	
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public TrackCoach(HappyFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
}
