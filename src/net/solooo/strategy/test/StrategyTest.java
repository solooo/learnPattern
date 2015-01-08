package net.solooo.strategy.test;

import net.solooo.strategy.Context;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void contextTest() {
		Context context = new Context("a");
		context.operate();
		context = new Context("b");
		context.operate();
		
	}
}
