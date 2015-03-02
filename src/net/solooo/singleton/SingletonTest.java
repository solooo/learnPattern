package net.solooo.singleton;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		Singleton st3 = Singleton.getInstance();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st1 == st2);
	}

}
