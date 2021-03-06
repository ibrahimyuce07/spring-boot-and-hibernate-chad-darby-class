package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CostructorDemoApp {
	public static void main(String[] args) {
			
//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//retrive a bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
//call method on the bean
		System.out.println(coach.getDailyWorkout());
//let's call our new methods for fortunes
		System.out.println(coach.getDailyFortune());
//close the context
		context.close();
	}
}
