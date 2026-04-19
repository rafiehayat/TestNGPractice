package LoopJava;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(num);
		
		
		double num2 = sc.nextDouble();
		float num3 = sc.nextFloat();
		String city = sc.next();
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(city);
		
		System.out.println("Enter unknown value");
		Object value = sc.next();
		System.out.println(value);

		
		

		

	}

}
