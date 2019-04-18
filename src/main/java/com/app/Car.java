package com.app;

public class Car {
	private String carCompany;
	private String modelNo;
	
	public Car() {
		
	}
	
	public Car(String carCompany, String modelNo) {
		this.carCompany = carCompany;
		this.modelNo = modelNo;
	}
	
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
		System.out.println("Car company :"+this.carCompany);
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
		System.out.println("Car modelNo :"+this.modelNo);
	}
	
	
}
