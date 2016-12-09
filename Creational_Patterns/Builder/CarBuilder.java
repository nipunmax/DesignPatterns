package com.designpatterns.builderpattern;

public class CarBuilder {

	public Car PrepareSedan()
	{
		Car car = new Car();
		car.addItems(new SedanPart());
		car.addItems(new LevelOneMirror());
		return car;
	}
	public Car PrepareHashback()
	{
		Car car = new Car();
		car.addItems(new HachBackPart());
		car.addItems(new LevelOneMirror());
		return car;
	}
	public Car PrepareSuv2W()
	{
		Car car = new Car();
		car.addItems(new Suv2W());
		car.addItems(new LevelTwoMirror());
		return car;
	}
	public Car PrepareSuv4x4()
	{
		Car car = new Car();
		car.addItems(new Suv4X4());
		car.addItems(new LevelTwoMirror());
		return car;
	}
}
