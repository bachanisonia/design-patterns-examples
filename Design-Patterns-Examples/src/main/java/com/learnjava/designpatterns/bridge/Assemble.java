package com.learnjava.designpatterns.bridge;

public class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.println("Assembled");
	}

}
