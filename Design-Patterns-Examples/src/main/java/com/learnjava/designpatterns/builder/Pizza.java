package com.learnjava.designpatterns.builder;

import java.util.List;

public class Pizza {

	private PizzaType pizzaType;
	private String breadType;
	private String cheeseType;
	private List<String> toppings;
	
	
	
	public Pizza(PizzaType pizzaType, String breadType, String cheeseType, List<String> toppings) {
		super();
		this.pizzaType = pizzaType;
		this.breadType = breadType;
		this.cheeseType = cheeseType;
		this.toppings = toppings;
	}
	
	public PizzaType getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getBreadType() {
		return breadType;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public String getCheeseType() {
		return cheeseType;
	}
	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}
	public List<String> getToppings() {
		return toppings;
	}
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
	
	@Override
	public String toString() {
		return "Pizza [pizzaType=" + pizzaType + ", breadType=" + breadType + ", cheeseType=" + cheeseType
				+ ", toppings=" + toppings + "]";
	}
	
	
	
}
