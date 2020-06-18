package io;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		InputOutput obj = new InputOutput();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value of A : ");
		
		int a = input.nextInt();
		
		System.out.println("Please enter the value of B : ");
		
		int b = input.nextInt();
		
		System.out.println("The sum is : " + obj.add(a, b));
	}
	
	public int add(int a, int b) {
		
		return a+b;
	} 
}
