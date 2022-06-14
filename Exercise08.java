package part02;

import java.util.Scanner;

public class Exercise08 {
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input: ");
		num = scanner.nextInt();
		
		for(int i=2; i<=num; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}