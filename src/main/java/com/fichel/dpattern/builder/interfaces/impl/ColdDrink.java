package com.fichel.dpattern.builder.interfaces.impl;

import com.fichel.dpattern.builder.interfaces.Item;
import com.fichel.dpattern.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
