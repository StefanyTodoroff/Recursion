package demo;

import java.util.Scanner;
	public class Zadacha3Iteration {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer n.");
		int n = sc.nextInt();
		System.out.println("2 ^ n = " + result(n));
		sc.close();
		
	}
	
	//iteration
	public static int result(int n) {
		int result = 1;
		for(int i = 0; i < n; i++) {
			result *= 2;
		}
		return result;
	}
	}
	
