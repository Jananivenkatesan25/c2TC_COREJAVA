package com.tns.ifet.day6.usingfinal;

public class FinalVariable {

	final int x = 100; // Initialized final instance variable

	// Declare a static blank final variable.
	final static int Y;

	// Declare & initialize static final variable.
	final static int Z = 10;

	// Instance method
	void change() {
		// x = 30; // Cannot reassign a final variable
		// Y = 200; // Cannot reassign a final static variable
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y=" + Y + "]";
	}

	// Static block to initialize the final static variable Y
	static {
		Y = 20;
		System.out.println("Value of Y: " + Y);
	}

}