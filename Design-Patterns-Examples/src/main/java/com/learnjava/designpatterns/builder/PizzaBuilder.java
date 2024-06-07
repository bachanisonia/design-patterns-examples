package com.learnjava.designpatterns.builder;

import java.util.List;

public class PizzaBuilder implements Builder {

	private PizzaType pizzaType;
	private String breadType;
	private String cheeseType;
	private List<String> toppings;
	
	
	@Override
	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}

	@Override
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	@Override
	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}

	@Override
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
	
	public Pizza getPizza() {
		return new Pizza(pizzaType, breadType, cheeseType, toppings);
	}

}
