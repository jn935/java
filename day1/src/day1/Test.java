/*
  //1:write program to test Hello World.
 


package day1;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

	}

}
*/
/*

//2:Write a program to adddition of two numbers also addition of two characters.
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

*/
/*
//2:Write a program to  addition of two characters.

package day1;
import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		String no1;
		String no2;
		char result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Charector =   ");
		no1 = sc.next();
		System.out.println("Enter Second Charector =  ");
		no2 = sc.next();
		
		System.out.println(""+no1+""+no2);
		
	}
}
*/

/*
//3:Find the compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.


package day1;
import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		public void calculate(int p,int t,double r,int n) {
			double amount = p * Math.pow(1+(r/n), n*t);
			double cinterest = amount - p;
			System.out.println("Compound Interest after"+t+"years:"+cinterest);
			System.out.println("Amount after"+t+"years:"+amount);
		}
		public static void main(String args[]) {
			JavaExample obj = new JavaExample();
			obj.calculate(20000,3,0.06,1)
		}
	}
*/




















	
	


/*
//4:Write a program to calculate power of a number.
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
*/


/*
package day1;
import java.util.Scanner;

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1, no2;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1:");
		no1 = sc.nextInt();

		System.out.println("Enter No2:");
		no2 = sc.nextInt();

		result = no1 + no2;

		System.out.println("Addition=" + result);

		result = no1 - no2;

		System.out.println("Subs=" + result);

		result = no1 * no2;

		System.out.println("Multi=" + result);
		if(no2>0)
		{
		result = no1 / no2;
		System.out.println("Div=" + result);
		}
		else
		{
			System.out.println("Can't Divide By 0");
		}

	}

}
*/
/*
//5:Write a program to swap two numbers.
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
*/
/*
//6:Write a program to find factorial of a given number.
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
*/	
/*
//7:Write a program to find m to the power n
package day1;
import java.util.Scanner;

public class Test{
	 public static void main(String args[]){ 
int base;
int exp;
int i = 1;
int result = 1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter  Number base =   ");
base = sc.nextInt();

System.out.println("Enter  Number exp =   ");
exp = sc.nextInt();

while (exp != 0) {
    result *= base;
    --exp;
  
} System.out.println("Result =   "+result);



	 }
}
*/
/*

//8:Check if number is a prime number or not.
package day1;
import java.util.Scanner;

public class Test{
	 public static void main(String args[]){ 
int no1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter  Number =   ");
no1 = sc.nextInt();

	
	int no2 = 2;
	int a= no1 % no2;
	if ( a!= 0)
	System.out.println("prime =  " + no1);
	else
	System.out.println("not prime =  " + no1);
	
	 }
}
*/

//9:Sum of series :
	//1+2+3+�.+n
/*
package day1;
import java.util.Scanner;

public class Test{
	 public static void main(String args[]){ 

		 int s;
		 int n = 0;
		 int a;
		 int l;
		 int b;
		 
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println(" Total Number of terms in the sequence =   ");
		 n = sc.nextInt();
		 b = n/2;
		 System.out.println("Enter  first number of series =   ");
		 a = sc.nextInt();
		 System.out.println("Enter  last term of series =   ");
		 l = sc.nextInt();
		 
		 s = b * (a + l);
		 System.out.println("Sum of series is =  " +s);
	 }
}

*/
/*
//10:Check whether the number is palindrome or not?

 package day1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 int num , reversedNum = 0, remainder;
		 Scanner sc = new Scanner(System.in);
			
		 System.out.println(" Enter a Number =   ");
		 num = sc.nextInt();
		
			   
			    
			    // store the number to originalNum
			    int originalNum = num;
			    
			    // get the reverse of originalNum
			    // store it in variable
			    while (num != 0)
			    {
			      remainder = num % 10;
			      reversedNum = reversedNum * 10 + remainder;
			      num /= 10;
			    }
			    
			    // check if reversedNum and originalNum are equal
			    if (originalNum == reversedNum) 
			    {
			      System.out.println(originalNum + " is Palindrome.");
			    }
			    else 
			    {
			      System.out.println(originalNum + " is not Palindrome.");
			            
			    }
	}	  
}
*/


	


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

/*
//11:Write a  program to find sum of all even and odd numbers between 1 to n. 

package day1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
int i;
int num = 0;
int even_sum=0; int odd_sum=0;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a Nmber  :   ");
num = sc.nextInt();
for(i=1;i<=num;i++)
	if(i%2==0)
	{
		even_sum=even_sum+i;
	}
	else
	{
		odd_sum=odd_sum+i;
	}
	System.out.println("Even_sum = "+even_sum);
	System.out.println("Odd_sum = "+odd_sum);
	}
}
*/
/*

//12: Write a  program to enter a number and print its reverse.
package day1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
       int num = 0;
       int origianal = num;
       int reversednum = 0;
       int remainder;
       System.out.println("Enter The Number  :   ");
       Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
       while(num!=0)
       {
    	   remainder=num%10;
    	   reversednum=remainder+reversednum*10;
    	   num/=10;
    	   
       }System.out.println("Reversed Num :   "+reversednum);
	}
}
*/
/*
//13:Write a  program to print all Prime numbers between 1 to n. 

package day1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int i,n=0,j  ;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number :   ");
		n = sc.nextInt();
		
		for(i=2;i<=n;i++) 
		{
			int c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
				c++;
				}
			}
			
		
		if (c==2) 
		{
			System.out.println(""+i);
		}
		
	}
	}
}
	*/	
	



		







/*
//14:Write a program to check entered number is Armstrong number or not.

package day1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
int num;int sum =0 ;int i,j;int r;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number");
num = sc.nextInt();
int temp = num;
while(num>0)
{
	r=num%10;
	sum = sum+(r*r*r);
	num= num/10;
}
if
(temp==sum)
	System.out.println("Armstrong number");
else
System.out.println("Not Armstrong number");
}
}
*/
	
	

/*
//15:Write a program to find greatest of three numbers using nested if-else.

package day1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int no1;
		int no2;
		int no3;
		int max ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no.= ");
		no1=sc.nextInt();
		System.out.println("Enter second no.= ");
		no2=sc.nextInt();
		System.out.println("Enter third no.= ");
		no3=sc.nextInt();
		if(no1>no2 && no1>no3)
		   System.out.println("Max :   "+no1);
		else if(no2>no1 && no2>no3);
		   System.out.println("Max :  "+no2);
		    if(no3>no1 && no3>no2)
			   System.out.println("Max :"+no3);
		
			
	}
}
	
*/	
/*
 * program to print reverse of array
package day1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int []arr = new int[] {1,2,3,4,5};{
			
		for(int i=0;i<arr.length;i++) {
			System.out.println(""+arr[i]);
		}
		System.out.println();
		System.out.println("Array in reverse order:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(""+arr[i]);
		}
	}
	}
}
		
    
*/





