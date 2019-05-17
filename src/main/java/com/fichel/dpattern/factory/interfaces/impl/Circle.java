package com.fichel.dpattern.factory.interfaces.impl;

import com.fichel.dpattern.factory.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape实现类Circle>>>draw()方法执行...");
	}
}