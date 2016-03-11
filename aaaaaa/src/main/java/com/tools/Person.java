package com.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	@Qualifier("add1")
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}	
	public void callMe()
	{
		System.out.println("hiiiiiiiiiiiii S");
		
		
	}
	
	
}
