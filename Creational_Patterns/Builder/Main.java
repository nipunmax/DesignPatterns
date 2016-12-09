package com.designpatterns.builderpattern;

public class Main {

	public static void main(String[] args) {
		
		CarBuilder builder = new CarBuilder();
		Car sedan = builder.PrepareSedan();
		sedan.showItems();
		System.out.println("total cost is " + sedan.getCost());
		System.out.println("\n");
		
		Car suv4x4 = builder.PrepareSuv4x4();
		suv4x4.showItems();
		System.out.println( "total cost is "  +suv4x4.getCost());
		System.out.println("\n");
	}

}
