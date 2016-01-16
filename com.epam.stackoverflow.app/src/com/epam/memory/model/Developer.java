package com.epam.memory.model;

/*
 * Class simulates developer. 
 * Each developer has its own tester.
 */
public class Developer {
	private Tester tester;
	
	public Developer(){
		this.tester = new Tester();
	}
}
