package com.learnjava.designpatterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learnjava.designpatterns.builder.Director;
import com.learnjava.designpatterns.builder.Pizza;
import com.learnjava.designpatterns.builder.PizzaBuilder;

@SpringBootApplication
public class DesignPatternsExamplesApplication implements CommandLineRunner {

	@Autowired
	Director director;
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pizza pizza;
		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		
		director.makeChickenFeastPizza(pizzaBuilder);
		pizza = pizzaBuilder.getPizza();
		System.out.println(pizza.toString());
		
		director.makeVegSupremePizza(pizzaBuilder);
		pizza = pizzaBuilder.getPizza();
		System.out.println(pizza.toString());
		
	}

}
