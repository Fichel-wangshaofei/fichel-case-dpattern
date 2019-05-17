package com.fichel.dpattern.builder.interfaces.impl;

import com.fichel.dpattern.builder.interfaces.Packing;

/**
 * @Description:TODO(包装类型实现类-纸盒) 
 * @author:Fichel
 * @date:2019年5月17日 下午3:33:54
 */
public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
