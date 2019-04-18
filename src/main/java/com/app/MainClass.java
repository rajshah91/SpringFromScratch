package com.app;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MainClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // Advanced container
		System.out.println("-----------------After creating context IoC object --------------------------");
		
		// loading the definitions from the given XML file
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory bf= new XmlBeanFactory(res); // Core Container
		
		
		
		MyTest test = (MyTest) context.getBean("test");
		test.printName();
		
		test=(MyTest)bf.getBean("test");
		test.printName();
		
		MyTest test1=(MyTest)bf.getBean("test");
		MyTest test2=(MyTest)bf.getBean("test");
		System.out.println("Is test1 and test2 are equal objects ? "+ (test1 == test2));
		
		
		PrivateConstructorTest privateConstructorTest = (PrivateConstructorTest) bf.getBean("privateConstructorTest");
		
		try {
			Class c= Class.forName("com.app.PrivateConstructorTest");
			Constructor con[]=c.getDeclaredConstructors();
			con[0].setAccessible(true);
			con[0].newInstance();
			System.out.println(c.getDeclaredConstructors().length);
			System.out.println(Modifier.toString(c.getDeclaredConstructors()[0].getModifiers()));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ConstructorArgumentTest constructorArgumentTest= (ConstructorArgumentTest)bf.getBean("constructorArgumentTest");
		
		ConstructorArgumentOverloadingTest constructorArgumentOverloadingTest=(ConstructorArgumentOverloadingTest)bf.getBean("constructorArgumentOverloadingTest");
		
		ConstructorArgumentOverloadingTest Test7=(ConstructorArgumentOverloadingTest)bf.getBean("constructorArgumentOverloadingTest7");
		ConstructorArgumentOverloadingTest Test8=(ConstructorArgumentOverloadingTest)bf.getBean("constructorArgumentOverloadingTest8");
		
		Test7.printValues();
		Test8.printValues();
		
	}
}
