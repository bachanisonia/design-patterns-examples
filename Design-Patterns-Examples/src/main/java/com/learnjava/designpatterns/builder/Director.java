package com.learnjava.designpatterns.builder;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Director {

	
	public void makePepperoniPizza(PizzaBuilder pizzaBuilder) {
		
		pizzaBuilder.setPizzaType(PizzaType.PEPPERONI);
		pizzaBuilder.setBreadType("THIN_SLICE");
		pizzaBuilder.setCheeseType("PROCESSED");
		pizzaBuilder.setToppings(Arrays.asList("PEPPERONI","TOMATO","ONION"));
		
	}
	
	public void makeChickenFeastPizza(PizzaBuilder pizzaBuilder) {
		
		pizzaBuilder.setPizzaType(PizzaType.CHICKEN_FEAST);
		pizzaBuilder.setBreadType("THICK_SLICE");
		pizzaBuilder.setCheeseType("PROCESSED");
		pizzaBuilder.setToppings(Arrays.asList("CHICKEN","TOMATO","ONION"));
		
	}
	
	
	public void makeVegSupremePizza(PizzaBuilder pizzaBuilder) {
		
		pizzaBuilder.setPizzaType(PizzaType.VEG_SUPREME);
		pizzaBuilder.setBreadType("THICK_SLICE");
		pizzaBuilder.setCheeseType("PROCESSED");
		pizzaBuilder.setToppings(Arrays.asList("CORN","TOMATO","ONION","PEPPER","OLIVES","JALAPENOES"));
		
	}
	
	
}
