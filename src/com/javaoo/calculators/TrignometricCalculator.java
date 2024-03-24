package com.javaoo.calculators;

public class TrignometricCalculator {
	
	public static double sine(double x) {
		System.out.print("Sine value of "+x+" is ");
		return Math.sin(x);
	}
	
	public static double cosine(double x) {
		System.out.print("Cosine value of "+x+" is ");
		return Math.cos(x);
	}
	
	public static double tangent(double x) {
		System.out.print("Tangent value of "+x+" is ");
		return Math.tan(x);
	}
	
	public static double arcsine(double x) {
		System.out.print("Arc sine value of "+x+" is ");
		return Math.asin(x);
	}
	
	public static double arccosine(double x) {
		System.out.print("Arc cosine value of "+x+" is ");
		return Math.acos(x);
	}
	
	public static double arctangent(double x) {
		System.out.print("Arc tangent value of "+x+" is ");
		return Math.atan(x);
	}
}
