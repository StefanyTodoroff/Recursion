package demo;
import java.util.Scanner;
public class Zadacha3 {
	//recursion
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer n.");
		int n = sc.nextInt();
		System.out.println("2 ^ n = " + result(n));
		sc.close();
		
	}
	

	public static int result(int n) {
		if (n == 0) 
			return 1;
		else
			return 2 * result(n - 1);
	}
}
