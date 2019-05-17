package com.fichel.dpattern.builder.interfaces;

/**
 * @Description:TODO(表示食物条目接口)
 * @author Fichel
 * @date 2019年5月17日 下午3:28:46
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
