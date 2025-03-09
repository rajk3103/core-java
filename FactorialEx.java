package com.fullstack.basic;

public class FactorialEx {
	
	public static void main(String[] args) {
		
		int sum = 1;
		int num=8;
		for(int i=1;i<=num;i++) {
			
			sum=sum*i;
		}
		
		System.out.println(num+" Factorial is : "+sum);
	}

}
