package com.fichel.dpattern.afactory.interfaces.impl;

import com.fichel.dpattern.afactory.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape实现类Square>>>draw()方法执行...");
	}

}
