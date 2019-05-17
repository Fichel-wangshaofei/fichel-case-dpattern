package com.fichel.dpattern.afactory.model;

import com.fichel.dpattern.afactory.interfaces.Color;
import com.fichel.dpattern.afactory.interfaces.Shape;
import com.fichel.dpattern.afactory.interfaces.impl.Circle;
import com.fichel.dpattern.afactory.interfaces.impl.Rectangle;
import com.fichel.dpattern.afactory.interfaces.impl.Square;

/**
 * @Description:TODO(工厂方法类) 
 * @author	Fichel
 * @date	2019年5月17日 下午1:50:34
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if(shape==null) {
			return null;
		}
		if("CIRCLE".equalsIgnoreCase(shape)) {
			return new Circle();
		}else if("RECTANGLE".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}else if("SQUARE".equalsIgnoreCase(shape)) {
			return new Square();
		}
		return null;
	}

}
