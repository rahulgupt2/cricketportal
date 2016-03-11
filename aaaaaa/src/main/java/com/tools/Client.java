package com.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tools.config.HelloConfig;

public class Client {
public static void main(String[] args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/springbean.xml");
/*	ConnectionMaker ck=(ConnectionMaker)applicationContext.getBean("id3");
	ck.loadAll();*/
	

	
Person p=(Person) applicationContext.getBean("person");
p.getAddress().msg();


/*ApplicationContext applicationContext=new AnnotationConfigApplicationContext(HelloConfig.class);
Person p= (Person)applicationContext.getBean("hellobean");	

p.callMe();
*/
System.out.println("success");

	
}
}
