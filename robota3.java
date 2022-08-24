package com.yanok;

import java.util.Scanner;

public class robota3 {

	public static void main(String[] args) {
		
		System.out.println("Введіть кількість школярів, а потім кількість яблук які вони поділять між собою");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int suma = K / N;
		System.out.println("Кожен із школярів отримає порівну таку кількість яблук: " +suma);

	}

}
