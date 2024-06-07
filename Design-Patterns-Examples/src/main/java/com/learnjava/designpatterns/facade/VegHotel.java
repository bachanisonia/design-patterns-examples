package com.learnjava.designpatterns.facade;

import java.util.Map;

public class VegHotel implements Hotel {

	@Override
	public Menu getMenu() {
		Menu veg = new Menu(Map.of(
				"Dum Aloo", 200,
				"Paneer Tikka",150,
				"Aloo Dum Biryani", 250
				)
			);
		return veg;
	}
	
}
