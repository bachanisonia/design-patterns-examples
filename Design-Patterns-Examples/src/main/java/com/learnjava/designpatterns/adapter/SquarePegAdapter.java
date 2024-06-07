package com.learnjava.designpatterns.adapter;

import org.springframework.beans.factory.annotation.Autowired;

public class SquarePegAdapter extends RoundPeg {

	@Autowired
	private SquarePeg squarePeg;

	public SquarePegAdapter(SquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}
	
	@Override
	public int getRadius() {
		return (int) (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
	}

	
}
