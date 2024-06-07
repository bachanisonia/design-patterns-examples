package com.learnjava.designpatterns.decorator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorPatternExample implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorPatternExample.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Shape circle = new Circle();
		circle.draw();
		
		Shape redCircle = new RedShapeDecorator(circle);
		redCircle.draw();
		
		Shape rectangle = new Rectangle();
		Shape redRectangle = new RedShapeDecorator(rectangle);
		redRectangle.draw();
	}

}
