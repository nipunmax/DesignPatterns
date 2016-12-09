package com.designpatterns.builderpattern;

public class HachBackPart implements Part{

	public String name() {
		// TODO Auto-generated method stub
		return "Brand New HachBack Windscreen";
	}

	public float price() {
		// TODO Auto-generated method stub
		return 25000.0f;
	}

	public Glass glass() {
		// TODO Auto-generated method stub
		return new Premium();
	}

}
