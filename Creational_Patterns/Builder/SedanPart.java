package com.designpatterns.builderpattern;

public class SedanPart implements Part {

	public String name() {
		// TODO Auto-generated method stub
		return "Brand New Sedan Windscreen";
	}

	public float price() {
		// TODO Auto-generated method stub
		return 40000.0f;
	}

	public Glass glass() {
		// TODO Auto-generated method stub
		return new Premium();
	}

}
