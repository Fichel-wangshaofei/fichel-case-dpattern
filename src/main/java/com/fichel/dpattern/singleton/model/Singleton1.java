package com.fichel.dpattern.singleton.model;

/**
 * @Description:TODO(懒汉式，线程不安全)
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * @author Fichel
 * @date 2019年5月17日 下午2:41:35
 */
public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Singleton1>>>showMessage()>>>Hello World!");
	}
}
