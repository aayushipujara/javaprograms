//4.1 Write a java program to perform different arithmetic operations. (Using command line args).

class u1p4 
{
	 public static void main(String args[])
	 {
		 int a = Integer.parseInt(args[0]);
		 int b = Integer.parseInt(args[1]);
		 System.out.println("First number : " + a);
		 System.out.println("Second number : " + b);
		 System.out.println("Addition : " + (a+b));
		 System.out.println("Substraction: " + (a-b));
	         System.out.println("Multiplication : " + (a*b));
	         System.out.println("Division : " +(a/b));
		 System.out.println("Modulus: " +(a%b));
	 } 
}	 
	 
