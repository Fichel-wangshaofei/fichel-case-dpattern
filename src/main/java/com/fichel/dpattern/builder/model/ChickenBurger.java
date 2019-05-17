package com.fichel.dpattern.builder.model;

import com.fichel.dpattern.builder.interfaces.impl.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		 return "Chicken Burger";
	}

	@Override
	public float price() {
		 return 50.5f;
	}

}
