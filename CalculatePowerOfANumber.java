package day1;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {

int base;
int exp;
 long result=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter base =        ");
base=sc.nextInt(); 
System.out.println("Enter exp =    ");
exp=sc.nextInt();
while(exp != 0) {
    	result*=base;
    	--exp;
    	
           }
System.out.println(""+result);

}
}
