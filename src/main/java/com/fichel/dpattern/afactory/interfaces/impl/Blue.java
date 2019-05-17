package com.fichel.dpattern.afactory.interfaces.impl;

import com.fichel.dpattern.afactory.interfaces.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Color实现类Blue>>>fill()方法调用...");
	}

}
