package net.solooo.strategy;

import net.solooo.strategy.strategy.Istrategy;
import net.solooo.strategy.strategy.impl.StrategyA;
import net.solooo.strategy.strategy.impl.StrategyB;

public class Context {

	private Istrategy strategy;
	
	public Context(String strategy) {
		switch(strategy) {
		case "a":
			this.strategy = new StrategyA();
			break;
		case "b":
			this.strategy = new StrategyB();
			break;
		default:
			break;
		}
	}
	
	/**
	 * 想要执行的操作
	 */
	public void operate() {
		this.strategy.operate();
	}
	
}
