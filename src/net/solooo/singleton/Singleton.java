package net.solooo.singleton;

public class Singleton {

	private Singleton() {};
	
	private static class SingletonInstance {
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonInstance.instance; // 单例，延迟加载兼顾效率
//		return new Singleton(); // 非单例，每次返回新的对象
	}
	
}
