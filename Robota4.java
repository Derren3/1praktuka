package com.yanok;
import java.util.Scanner;
public class Robota4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть кількість школярів, а потім кількість яблук які вони поділять між собою");
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int suma = K / N;
		suma = suma * N;
		int ostatok = K - suma;
		
		System.out.println("В кошику залишиться така кількість яблук: " +ostatok);

	}

}
