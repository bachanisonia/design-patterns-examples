package com.learnjava.designpatterns.builder;

import java.util.List;

public interface Builder {
	
	public void setPizzaType(PizzaType pizzaType);
	public void setBreadType(String breadType);
	public void setCheeseType(String cheeseType);
	public void setToppings(List<String> toppings);
	
}
