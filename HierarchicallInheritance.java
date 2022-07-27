package com.infy.projects.Inheritance;

public class HierarchicallInheritance {
	

	public static void main(String[] a) {
	
	Child1 c= new Child1();
	c.Login();
	c.Purchase();	
	Child2 c2= new Child2();
	c2.Payment();
	MultilevelInheritance m = new MultilevelInheritance();
	m.Login();
	m.Purchase();
	
	
	}
	

}
