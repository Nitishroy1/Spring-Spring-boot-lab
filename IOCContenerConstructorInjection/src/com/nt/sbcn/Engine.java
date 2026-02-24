package com.nt.sbcn;

public class Engine {
	String engineType;
	String horsePower;
	
	public Engine(String enginType, String horsePower) {
		this.engineType=enginType;
		this.horsePower=horsePower;
	}
	
	public void showEngineDetails() {
		System.out.println("Engine Type is: "+this.engineType);
		System.out.println("Engine Horse power is: "+this.horsePower);
	}

}
