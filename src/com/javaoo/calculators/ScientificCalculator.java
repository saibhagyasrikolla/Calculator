package com.javaoo.calculators;

public class ScientificCalculator {
	
	public static final double PI = 3.14159;
	private double holdValue;
	
	public static final double exp(double x) {
		System.out.print("Exponential value of "+x+" is ");
		return Math.exp(x);
	}
	
	public static final double log(double x) {
		System.out.print("Logarthmic value of "+x+" is ");
		return Math.log(x);
	}
	
	public final void putValueInMemory(double value) {
		holdValue = value;
	}
	
	public double getValueFromMemory() {
		System.out.print("The value in the memory is ");
		return holdValue;
	}
}
