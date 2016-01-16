package com.epam.memory.runner;

import com.epam.memory.model.Developer;

/*
 * Example demonstrates how StackOverflowError can be generated without using of recursive methods. 
 * Here you can see creation of developer. During creation of developer tester is created.
 * During tester is created one more developer is created too. Such model will lead us to StackOverFlowError.
 */
public class StackOverflowErrorRunner {

	public static void main(String[] args) {

		Developer developer = new Developer();
		System.out.println("The End.");
	}

}
