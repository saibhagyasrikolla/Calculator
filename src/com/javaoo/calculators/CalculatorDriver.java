package com.javaoo.calculators;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		BasicCalculator bc =  new BasicCalculator();
		ScientificCalculator sc = new ScientificCalculator();
		TrignometricCalculator tc = new TrignometricCalculator();
		
		System.out.println(bc.add(5, 4));
		System.out.println(bc.subtract(5, 4));
		System.out.println(bc.multiply(5, 4));
		System.out.println(bc.divide(5, 4));
		
		System.out.println(sc.exp(7));
		System.out.println(sc.log(7));
		sc.putValueInMemory(7);
		System.out.println(sc.getValueFromMemory());
		
		System.out.println(tc.sine(90));
		System.out.println(tc.cosine(90));
		System.out.println(tc.tangent(90));
		System.out.println(tc.arcsine(90));
		System.out.println(tc.arccosine(90));
		System.out.println(tc.arctangent(90));
	}

}
