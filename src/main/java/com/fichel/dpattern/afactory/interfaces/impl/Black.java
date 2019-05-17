package com.fichel.dpattern.afactory.interfaces.impl;

import com.fichel.dpattern.afactory.interfaces.Color;

public class Black implements Color {

	@Override
	public void fill() {
		System.out.println("Color实现类Black>>>fill()方法执行...");
		
	}

}
