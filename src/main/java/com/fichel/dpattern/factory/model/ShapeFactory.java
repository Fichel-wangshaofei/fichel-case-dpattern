package com.fichel.dpattern.factory.model;

import com.fichel.dpattern.factory.interfaces.Shape;
import com.fichel.dpattern.factory.interfaces.impl.Circle;
import com.fichel.dpattern.factory.interfaces.impl.Rectangle;
import com.fichel.dpattern.factory.interfaces.impl.Square;

/**
 * @Description:TODO(工厂方法类) 
 * @author	Fichel
 * @date	2019年5月17日 下午1:50:34
 */
public class ShapeFactory {
	public Shape getShape(String type) {
		if(type==null) {
			return null;
		}
		if("CIRCLE".equalsIgnoreCase(type)) {
			return new Circle();
		}else if("RECTANGLE".equalsIgnoreCase(type)) {
			return new Rectangle();
		}else if("SQUARE".equalsIgnoreCase(type)) {
			return new Square();
		}
		return null;
	}
}
