import java.util.Scanner;
public class u1p7_6
{ public static void main(String[] args)
   {
		    Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the attendance:");
			int attendance=scn.nextInt();
			System.out.println("Enter the marks:");
            int marks=scn.nextInt();
        if (attendance >= 50)
			{
            if (marks >= 50)
				{
                System.out.println("You are pass");
                }
			else
				{
                System.out.println("You fail");
                }
            }
		else
			{
            if (marks >= 50)
				{
                System.out.println("You fail");
                }
            
			else
				{
                System.out.println("You fail");
                }
            }
   }
}