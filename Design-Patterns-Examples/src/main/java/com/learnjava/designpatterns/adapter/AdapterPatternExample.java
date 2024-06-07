package com.learnjava.designpatterns.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterPatternExample implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(AdapterPatternExample.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
			RoundHole roundHole = new RoundHole(5);
			RoundPeg roundPeg = new RoundPeg(5);
			
			System.out.println(roundHole.fits(roundPeg));
			
			SquarePeg smallSquarePeg = new SquarePeg(4);
			SquarePeg largeSquarePeg = new SquarePeg(20);
			
			SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
			SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
			
			System.out.println(roundHole.fits(largeSquarePegAdapter));
			System.out.println(roundHole.fits(smallSquarePegAdapter));
		
	}

}
