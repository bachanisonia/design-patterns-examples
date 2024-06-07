package com.learnjava.designpatterns.facade;

import java.util.Map;

public class NonVegHotel implements Hotel {

	@Override
	public Menu getMenu() {
		Menu nonVeg = new Menu(Map.of(
				"Butter Chicken", 200,
				"Chicken Tikka",150,
				"Chicken Biryani", 250
				)
			);
		return nonVeg;
	}

}
