//4.2 Write a java program to perform different arithmetic operations without using command line args.

import java.util.Scanner;
public class u1p3
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First no. :");
	double num1 = sc.nextDouble();
	
	System.out.print("Enter Second no. :");
	double num2 = sc.nextDouble();
	
	double Addition = num1 + num2;
	double Substraction = num1 - num2;
	double Multiplication = num1 * num2;
	double Division = num1/num2;
	double Modulus = num1%num2;
	
	System.out.println( "Addition = " + Addition  );
	System.out.println( "Substraction = " + Substraction);
	System.out.println( "Multiplication = " + Multiplication);
	System.out.println( "Division = " + Division);
	System.out.println( "Modulus = " + Modulus);
	sc.close();
   }
}   
	