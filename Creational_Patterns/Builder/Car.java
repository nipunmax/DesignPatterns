package com.designpatterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Car {

	   private List<Part> items = new ArrayList<Part>();	
	   
	   public void addItems(Part part)
	   {
		   items.add(part);
		   
	   }
	   public float getCost(){
		      float cost = 0.0f;
		      
		      for (Part item : items) {
		         cost += item.price();
		      }		
		      return cost;
		   }
	   
	   public void showItems(){
		   System.out.println("Following items will be used for building the car");
		      for (Part item : items) {
		         System.out.print("Part : " + item.name());
		         System.out.print(", Glass : " + item.glass().GlassType());
		         System.out.println(", Price : " + item.price());
		      }
		    

		   }	
}


