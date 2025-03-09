package com.fullstack.basic;

public class OTPRandomNumber {

	public static void main(String[] args) {
		
		System.out.println(" Random Number: " + Math.random()); 
		System.out.println(" Random Number1: " + Math.random()); 
		System.out.println(" Random Number2: " + Math.random()); 
		System.out.println(" Random Number3: " + Math.random()); 
		System.out.println(" Random Number4: " + Math.random()); 
		
		int min=1000;
		int max=9999;
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("OTP: "+b);
		System.out.println("OTP: "+b);
		double c = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(c);
		System.out.println(c);

  
	}
}
