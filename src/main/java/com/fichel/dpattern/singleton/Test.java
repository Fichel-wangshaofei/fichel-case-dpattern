package com.fichel.dpattern.singleton;

import com.fichel.dpattern.singleton.model.Singleton1;
import com.fichel.dpattern.singleton.model.Singleton2;
import com.fichel.dpattern.singleton.model.Singleton3;
import com.fichel.dpattern.singleton.model.Singleton4;
import com.fichel.dpattern.singleton.model.Singleton5;
import com.fichel.dpattern.singleton.model.Singleton6;

public class Test {

	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getInstance();
		singleton1.showMessage();
		
		Singleton2 singleton2 = Singleton2.getInstance();
		singleton2.showMessage();
		
		Singleton3 singleton3 = Singleton3.getInstance();
		singleton3.showMessage();
		
		Singleton4 singleton4 = Singleton4.getInstance();
		singleton4.showMessage();
		
		Singleton5 singleton5 = Singleton5.getInstance();
		singleton5.showMessage();
		
		Singleton6.INSTANCE.showMessage();
	}

}
