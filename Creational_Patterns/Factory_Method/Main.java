package com.designpatterns.factorypattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String ...args)
	{
		//Creates employee factory
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/designpatterns/factorypattern/beans/factory.xml");
		
		//Creates internal employee object
		Employee internal = (Employee)context.getBean("internal");
		internal.generateSalary();
		
		//Create external employee object
		Employee external =(Employee)context.getBean("external");
		external.generateSalary();
	
		//Creates contractor object	
		Employee contractor = (Employee)context.getBean("contractor");
		contractor.generateSalary();
		
		((ClassPathXmlApplicationContext)context).close();
	}
	
}
