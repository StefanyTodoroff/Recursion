package demo;

import java.util.Scanner;
public class Zadacha4Iteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a real number x.");
		double x = sc.nextDouble();
		System.out.println("Enter a positive integer n.");
		int n = sc.nextInt();
		System.out.println("x ^ n = " + result(n, x));
		sc.close();
		
	}
	
	//iteration
	public static double result(int n, double x) {
		double result = 1;
		for(int i = 0; i < n; i++) {
			result *= x;
		}
		return result;
	}

}
