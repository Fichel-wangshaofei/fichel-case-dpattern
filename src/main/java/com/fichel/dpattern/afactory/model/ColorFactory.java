package com.fichel.dpattern.afactory.model;

import com.fichel.dpattern.afactory.interfaces.Color;
import com.fichel.dpattern.afactory.interfaces.Shape;
import com.fichel.dpattern.afactory.interfaces.impl.Black;
import com.fichel.dpattern.afactory.interfaces.impl.Blue;
import com.fichel.dpattern.afactory.interfaces.impl.Red;

/**
 * @Description:TODO(工厂方法类) 
 * @author	Fichel
 * @date	2019年5月17日 下午1:50:34
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if(color==null) {
			return null;
		}
		if("BLACK".equalsIgnoreCase(color)) {
			return new Black();
		}else if("BLUE".equalsIgnoreCase(color)) {
			return new Blue();
		}else if("RED".equalsIgnoreCase(color)) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
