import java.util.Scanner;
public class u1p7_4
{ public static void main(String[] args)
   {
		    Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the attendance:");
			int attendance=scn.nextInt();
			
        if (attendance >= 50)
			{
			System.out.println("Enter the marks:");
            int marks=scn.nextInt();
            if (marks >= 50)
				{
                System.out.println("You are pass");
                }
			else
				{
                System.out.println("You are fail");
                }
			}
		else
			{
                System.out.println("Your attendance is less");
            }    
   }
}