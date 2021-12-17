package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress, team;
	
	
	
	@Autowired
	@Qualifier("RESTFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

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


	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
}
