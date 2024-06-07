package com.learnjava.designpatterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		addRedBorder();
	}

	private void addRedBorder() {
		System.out.println("Border Color : Red");
	}
	
}
