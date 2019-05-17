package com.fichel.dpattern.afactory.model;

/**
 * @Description:TODO(创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂)
 * @author Fichel
 * @date 2019年5月17日 下午2:32:47
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
