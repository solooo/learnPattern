package net.solooo.prototype;

import org.junit.Test;

public class ClassCloneTest {

	@Test
	public void test() {
		ClassClone cc = new ClassClone();
		cc.setValue("test");
		cc.setValue("123");
		System.out.println(cc.getValue());
		ClassClone c2 = cc.clone();
		c2.setValue("2222");
		System.out.println(cc.getValue());
	}

}
