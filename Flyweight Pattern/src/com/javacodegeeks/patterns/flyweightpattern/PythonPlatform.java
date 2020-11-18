package com.javacodegeeks.patterns.flyweightpattern;

public class PythonPlatform implements Platform {
	
	public PythonPlatform() {
		super();
		System.out.println("PythonPlatform object created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing Python code.");
		
	}

}
