package com.app;

public class MyTest {
	
	MyTest(){
		System.out.println("From MyTest Class Constructor");
	}
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Hello , "+this.name);
	}
}
