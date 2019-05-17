package com.fichel.dpattern.builder.interfaces.impl;

import com.fichel.dpattern.builder.interfaces.Packing;
/**
 * @Description:TODO(包装类型实现类-瓶子) 
 * @author:Fichel
 * @date:2019年5月17日 下午3:35:02
 */
public class Bottle implements Packing{

	@Override
	public String pack() {
		return "Bottle";
	}

}
