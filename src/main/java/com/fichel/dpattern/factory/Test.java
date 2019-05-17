package com.fichel.dpattern.factory;

import com.fichel.dpattern.factory.interfaces.Shape;
import com.fichel.dpattern.factory.model.ShapeFactory;

public class Test {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}
