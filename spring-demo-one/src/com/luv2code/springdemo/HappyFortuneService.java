package com.luv2code.springdemo;
import java.util.Random;   

public class HappyFortuneService implements FortuneService{

	String[]fortunes = {"1M euro","Wisdom","Health"};

	@Override
	public String getFortune() {
		Random random = new Random();
		return fortunes[random.nextInt(3)];
	}

}
