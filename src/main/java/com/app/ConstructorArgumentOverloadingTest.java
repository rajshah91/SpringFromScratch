package com.app;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConstructorArgumentOverloadingTest {
	
	private String city;
	private int population;
	private String name;
	private Car car;
	private List<String> companies;
	private Set<String> schools;
	private Map<String,String> documentMap;
//	private String degrees[];
	
	public ConstructorArgumentOverloadingTest() {
		
	}
	public ConstructorArgumentOverloadingTest(String city){
		this.city=city;
		System.out.println("From ConstructorArgumentOverloadingTest City param Constructor : city - "+this.city);
	}
	
	public ConstructorArgumentOverloadingTest(int population){
		this.population=population;
		System.out.println("From ConstructorArgumentOverloadingTest population param Constructor : population - "+this.population);
	}
	
	public ConstructorArgumentOverloadingTest(String city,int population){
		this.population=population;
		this.city=city;
		System.out.println("From ConstructorArgumentOverloadingTest city,population param Constructor : city - "+this.city+" -- Population : "+this.population);
	}
	
	public ConstructorArgumentOverloadingTest(String city,int population,String name){
		this.population=population;
		this.city=city;
		this.name=name;
		System.out.println("From ConstructorArgumentOverloadingTest city,population,name param Constructor : city - "+this.city+" -- Population : "+this.population+" -- Name :"+this.name);
	}
	
	public ConstructorArgumentOverloadingTest(String city,int population,String name,Car car){
		this.population=population;
		this.city=city;
		this.name=name;
		this.car=car;
		System.out.println("From ConstructorArgumentOverloadingTest city,population,name,car param Constructor : city - "+this.city+" -- Population : "+this.population+" -- Name :"+this.name+" -- Car : "+this.car);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
	public List<String> getCompanies() {
		return companies;
	}
	public void setCompanies(List<String> companies) {
		this.companies = companies;
		this.companies.forEach(c -> System.out.println(" Company : "+c));
	}
	
	public Set<String> getSchools() {
		return schools;
	}
	public void setSchools(Set<String> schools) {
		this.schools = schools;
		this.schools.forEach(s -> System.out.println(" School : "+s));
	}
	
	public Map<String, String> getDocumentMap() {
		return documentMap;
	}
	public void setDocumentMap(Map<String, String> documentMap) {
		this.documentMap = documentMap;
		this.documentMap.forEach((k,v) ->  System.out.println(" Document Name : "+k +" ,Document Value : "+v));
	}
	
	public void printValues() {
		System.out.println("From ConstructorArgumentOverloadingTest printValues method : city - "+this.city+" -- Population : "+this.population+" -- Name :"+this.name+" -- Car : "+this.car);
	}
	
}
