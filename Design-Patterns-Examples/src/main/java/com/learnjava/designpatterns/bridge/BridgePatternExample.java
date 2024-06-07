package com.learnjava.designpatterns.bridge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class BridgePatternExample implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BridgePatternExample.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		Vehicle car = new Car(new Produce(), new Assemble());
		car.manufacture();
		
		Vehicle bus = new Bus(new Produce(), new Assemble());
		bus.manufacture();
		
	}

}
