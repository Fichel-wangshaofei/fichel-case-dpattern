package com.fichel.dpattern.afactory.interfaces.impl;

import com.fichel.dpattern.afactory.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape实现类Rectangle>>>draw()方法执行...");
	}

}
