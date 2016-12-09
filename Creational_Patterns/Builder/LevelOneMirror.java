package com.designpatterns.builderpattern;

public class LevelOneMirror extends SideMirror{

	public String name() {
		// TODO Auto-generated method stub
		return "Level one side mirror";
	}

	public float price() {
		// TODO Auto-generated method stub
		return 5000.0f;
	}

	public Glass glass() {
		// TODO Auto-generated method stub
		return new Premium();
	}

}
