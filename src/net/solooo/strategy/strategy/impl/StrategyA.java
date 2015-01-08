package net.solooo.strategy.strategy.impl;

import net.solooo.strategy.strategy.Istrategy;

public class StrategyA implements Istrategy {

	@Override
	public void operate() {
		System.out.println("this is strategy A...");
	}

}
