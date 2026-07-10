//6.5
import java.util.Scanner;
	public class u1p6_5 
	{
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the string:");
			String Userstr=scn.nextLine();
			int num=scn.nextInt();
			scn.close();
			
			
			int i=1;
			 while (  i <= num)
			 {
              System.out.println(Userstr);
			  i++;
             }
			
			

  }
}