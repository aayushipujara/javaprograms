import java.util.Scanner;
public class u1p7_5
{ public static void main(String[] args)
   {
		    Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the attendance:");
			int attendance=scn.nextInt();
			
        if (attendance <= 50)
			
				{
                System.out.println("You are not eligible to give exam");
                }
			
		else
			System.out.println("Enter the marks:");
            int marks=scn.nextInt();
			{
            if (marks >= 50)
				{
                System.out.println("You pass");
                }
            
			else
				{
                System.out.println("You fail");
                }
            }
   }
}
