package com.learnjava.designpatterns.bridge;

public class Produce implements Workshop {

	@Override
	public void work() {
		System.out.println("Produced !!!");
	}

}
