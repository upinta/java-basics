package com.deep.copy;

public class Address {

	String city;
	String state;
	
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
	
	Address(Address address){
		this.city = address.city;
		this.state = address.state;
	}
}
