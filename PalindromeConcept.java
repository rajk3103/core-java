/*
 * package com.fullstack.basic;
 * 
 * public class PalindromeConcept {
 * 
 * public static void main(String[] args) {
 * 
 * int remainder, sum = 0, temp; int num = 12366371; // String d[]; temp = num;
 * while (num > 0) { remainder = num % 10; sum = (sum * 10) + remainder; num =
 * num / 10; // d = sum; } // System.out.println(d); if (temp == sum) {
 * System.out.println(temp + " :  is a Palindrome"); } else {
 * System.out.println(temp + " : is NOT a Palindrome"); }
 * 
 * } }
 */
 


package com.fullstack.basic;

import java.util.ArrayList;
import java.util.List;

public class PalindromeConcept {

	public static void main(String[] args) {

		int remainder, sum = 0, temp; int num = 121211; // You can change this  number to test different values

		temp = num; // Store original number

		List<Integer> sumValues = new ArrayList<>(); // List to store intermediate  values

		while (num > 0) { 
			remainder = num % 10; // Extract last digit 
			sum = (sum *  10) + remainder; // Build reversed number 
			num = num / 10; // Remove last digit
		
		sumValues.add(sum); // Store intermediate sum 
		}

	System.out.println("Intermediate values of sum: " + sumValues);
	System.out.println("Reversed Number: " + sum);

	if (temp == sum) { 
		System.out.println(temp + " is a Palindrome"); 
		} else {
		System.out.println(temp + " is NOT a Palindrome");
		}
}
}

