package com.yanok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Введіть 2 числа не більше 1000, що відповідають двом катетам трикутника");
		Scanner sc = new Scanner(System.in);
		int katet1 = sc.nextInt();
		int katet2 = sc.nextInt();
		
		double suma = katet1*katet1 + katet2*katet2;
		suma = Math.sqrt(suma);
		System.out.println("Гіпотенуза трикудника дорівнює = " + suma);
		
	}

}
