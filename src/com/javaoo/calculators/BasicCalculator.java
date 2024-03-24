package com.javaoo.calculators;

public class BasicCalculator {
	
	public final double add(double x,double y) {
		System.out.print("Addition of "+x+" and "+y+" is ");
		return x+y;
	}
	
	public final double subtract(double x,double y) {
		System.out.print("Subtraction of "+x+" and "+y+" is ");
		return x-y;
	}
	
	public final double multiply(double x,double y) {
		System.out.print("Multiplication of "+x+" and "+y+" is ");
		return x*y;
	}
	
	public final double divide(double x,double y) {
		System.out.print("Division of "+x+" and "+y+" is ");
		return x/y;
	}

}
