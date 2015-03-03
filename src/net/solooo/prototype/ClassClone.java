package net.solooo.prototype;

import java.util.ArrayList;

public class ClassClone implements Cloneable {

	private ArrayList<String> list = new ArrayList<String>();
	
	@Override
	public ClassClone clone() {
		ClassClone cc = null;
		try {
			cc = (ClassClone) super.clone();
			cc.list = (ArrayList<String>)this.list.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cc;
	}

	public void setValue(String arg) {
		list.add(arg);
	}
	
	public String getValue() {
		return list.toString();
	}
}
