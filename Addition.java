package day1;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		int no1, no2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no.= ");
		no1=sc.nextInt();
		System.out.println("Enter second no.");
		no2=sc.nextInt();
		result = no1 + no2;
		System.out.println("Addition="+result);
		
	}
}
