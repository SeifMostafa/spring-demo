package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	private String emailAddress, team;

	public String getEmailAddress() {
		return emailAddress;
	}

	

	@Autowired
	public String getTeam() {
		System.out.println("Hello, My fav Team is Arsenal!");
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@PostConstruct
	@Override
	public String getDailyWorkout() {
		System.out.println("Pass 30 in center");
		return "Pass 30 in center";
	}
	@PreDestroy
	@Override
	public String getDailyFortune() {
		System.out.println(fortuneService.getFortune());
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
