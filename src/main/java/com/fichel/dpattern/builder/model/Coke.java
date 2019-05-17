package com.fichel.dpattern.builder.model;

import com.fichel.dpattern.builder.interfaces.impl.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		 return 30.0f;
	}

}
