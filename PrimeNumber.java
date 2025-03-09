package com.fullstack.basic;

public class PrimeNumber {

	static void checkPrime(int n) {
		int m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} 
	}

	public static void main(String[] args) {

		checkPrime(24);
		checkPrime(1);
		checkPrime(3);
		checkPrime(17);
		checkPrime(7);
		checkPrime(21);
		checkPrime(19);

	}
}
