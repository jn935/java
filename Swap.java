package day1;
import java.util.Scanner;

public class Test{

	public static void main(String[] args) {
		int no1;
		int no2;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number =   ");
		no1 = sc.nextInt();
		System.out.println("Enter Second Number =   ");
		no2 = sc.nextInt();
		 temp = no1;
		 no1 = no2;
		 no2 = temp;

		 System.out.println("first number =   "+no1);
		 System.out.println("second number =   "+no2);
	
}
}
