package com.fichel.dpattern.builder.model;

import com.fichel.dpattern.builder.interfaces.impl.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
