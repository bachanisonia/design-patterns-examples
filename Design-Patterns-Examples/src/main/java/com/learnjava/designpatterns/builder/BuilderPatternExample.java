package com.learnjava.designpatterns.builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternExample implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BuilderPatternExample.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		
		Director director = new Director();
		director.makeChickenFeastPizza(pizzaBuilder);
		Pizza pizza = pizzaBuilder.getPizza();
		System.out.println(pizza);
		
		director.makeVegSupremePizza(pizzaBuilder);
		pizza = pizzaBuilder.getPizza();
		System.out.println(pizza);
		
	}

}
