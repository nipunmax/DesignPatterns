package com.designpatterns.factorypattern;

public class EmployeeFactory {

	
	public Employee getEmployee(String type)
	{
		System.out.println("generate object from factory");
		//based on the type (internal , external, contract) that passes to getEmployee factory it will return respective object
		if(type.equals("internal"))
			return new InternalEmployee();
		else if(type.equals("external"))
			return new ExternalEmployee();
		else if(type.equals("contract"))
			return new Contractor();
		return null;
	}
	

}
