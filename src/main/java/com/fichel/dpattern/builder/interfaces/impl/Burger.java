package com.fichel.dpattern.builder.interfaces.impl;

import com.fichel.dpattern.builder.interfaces.Item;
import com.fichel.dpattern.builder.interfaces.Packing;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
