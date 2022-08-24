package com.yanok;

import java.util.Scanner;

public class robota2 {

	public static void main(String[] args) {
		
		System.out.println("Введіть ціле число, не більше 10000");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int nextNumber = number+1;
		int previousNumber = number-1;
		
		System.out.println("The next number for the numbe " +number+ " is " +nextNumber);
		System.out.println("The previous number for the number " +number+ " is " +previousNumber);

	}

}
