package com.designpatterns.builderpattern;

public class LevelTwoMirror extends SideMirror{

	public String name() {
		// TODO Auto-generated method stub
		return "Level Two Mirror";
	}

	public float price() {
		// TODO Auto-generated method stub
		return 10000.0f;
	}

	public Glass glass() {
		// TODO Auto-generated method stub
		return new BulletProof();
	}

}
