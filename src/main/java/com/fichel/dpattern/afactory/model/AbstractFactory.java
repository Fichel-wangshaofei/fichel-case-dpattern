package com.fichel.dpattern.afactory.model;

import com.fichel.dpattern.afactory.interfaces.Color;
import com.fichel.dpattern.afactory.interfaces.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}
