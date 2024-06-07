package com.learnjava.designpatterns.facade;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadePatternExample implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FacadePatternExample.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		HotelKeeper hotelKeeper = new HotelKeeperImplementation();
		
		Menu menu = hotelKeeper.getVegMenu();
		
		String displayMenu = menu.toString();
		System.out.println(displayMenu);
		
		System.out.println(hotelKeeper.getNonVegMenu());
		//System.out.println(hotelKeeper.getBothMenu());
		
	}

}
