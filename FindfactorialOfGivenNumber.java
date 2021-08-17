package day1;
import java.util.Scanner;

public class Test{
	 public static void main(String args[]){  
	  int i,fact=1;  
	  int no1;
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Number =   ");
		no1 = sc.nextInt();
	  
	  //It is the number to calculate factorial    
	  for(i=1;i<=no1;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+no1+" is: "+fact);    
	 }  
	} 
