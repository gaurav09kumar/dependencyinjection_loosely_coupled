package com.example.dependencyinjection_loosely_coupled;

public class Airtel {

	private Service service;

	// setter injection
	public void setService(Service service) {
		this.service = service;
	}

	// call the service
	public void activateService() {
		service.service();
	}

}
