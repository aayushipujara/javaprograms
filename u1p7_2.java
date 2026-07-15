import java.util.Scanner;
public class u1p7_2 {
    public static void main(String[] args)
	{
		    Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the number:");
			int num=scn.nextInt();
        
        if (num % 2==0) 
		{
            System.out.println("Number is even.");
        }
		else
		{
            System.out.println("Number is odd.");
        }
    }
}