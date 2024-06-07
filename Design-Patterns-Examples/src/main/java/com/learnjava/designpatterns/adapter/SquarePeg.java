package com.learnjava.designpatterns.adapter;

public class SquarePeg {
	
	private int width;
	
	public SquarePeg(int width) {
		super();
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getSquare() {
		return (int) Math.pow(this.getWidth(), 2);
	}
	
	
}
