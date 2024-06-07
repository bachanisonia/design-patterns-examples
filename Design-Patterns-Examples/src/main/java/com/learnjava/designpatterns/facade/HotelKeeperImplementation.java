package com.learnjava.designpatterns.facade;

import java.util.HashMap;
import java.util.Map;

public class HotelKeeperImplementation implements HotelKeeper {

	@Override
	public Menu getVegMenu() {
		
		VegHotel vegHotel = new VegHotel();
		return vegHotel.getMenu();
	}

	@Override
	public Menu getNonVegMenu() {
		NonVegHotel nonVegHotel = new NonVegHotel();
		return nonVegHotel.getMenu();
	}

	@Override
	public Menu getBothMenu() {
		
		Map<String,Integer> both = new HashMap<>();
		
		VegHotel vegHotel = new VegHotel();
		NonVegHotel nonVegHotel = new NonVegHotel();
		
		both.putAll(vegHotel.getMenu().getItems());
		both.putAll(nonVegHotel.getMenu().getItems());
		
		return new Menu(both);
	}
	
}
