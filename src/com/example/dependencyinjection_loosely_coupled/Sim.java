package com.example.dependencyinjection_loosely_coupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Airtel airtel_service = context.getBean("servicerequest1", Airtel.class);
		airtel_service.activateService();

	}

}
