package com.app;

public class ConstructorArgumentTest {
	
	private String city;
	
	public ConstructorArgumentTest(String city) {
	    this.city=city;
	    System.out.println("Hello From ConstructorArgumentTest parameterized Constructor : City = "+this.city);
	}
}
