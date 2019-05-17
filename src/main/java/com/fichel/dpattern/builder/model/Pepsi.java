package com.fichel.dpattern.builder.model;

import com.fichel.dpattern.builder.interfaces.impl.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
