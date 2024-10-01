package com.reference.variable;

public class ArrayReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number1 = {1,2,3,4};
		int[] number2 = number1;
		
		System.out.println(number1[0]);
		System.out.println(number2[0]);
		
		number2[0] = 100;
		
		System.out.println(number1[0]);
		System.out.println(number2[0]);
		
	}

}
