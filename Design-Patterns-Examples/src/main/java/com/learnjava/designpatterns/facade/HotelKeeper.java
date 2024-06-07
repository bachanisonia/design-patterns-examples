package com.learnjava.designpatterns.facade;

public interface HotelKeeper {

	public Menu getVegMenu();
	public Menu getNonVegMenu();
	public Menu getBothMenu();
}
