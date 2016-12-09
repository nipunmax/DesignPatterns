package com.designpatterns.builderpattern;

public abstract class SuvPart implements Part{
	

	public Glass glass() {
		// TODO Auto-generated method stub
		return new BulletProof();
	}
}
