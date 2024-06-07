package com.learnjava.designpatterns.bridge;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Vehicle {
	
	@Autowired
	protected Workshop workshop1;
	
	@Autowired
	protected Workshop workshop2;
	
	public Vehicle(Workshop workshop1, Workshop workshop2) {
		super();
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	
	abstract public void manufacture();
	
}
