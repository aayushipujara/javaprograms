import java.util.Scanner;
public class u1p7_3
{ public static void main(String[] args)
   {
		    Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the number from 1 to 100:");
			int score=scn.nextInt();
        
        if (score >= 90) 
		{
            System.out.println(" Grade A");
        }
		else if (score >= 80)
		{
            System.out.println("Grade B");
        } 
		else
		{
            System.out.println("Grade C");
        }
    }
}
