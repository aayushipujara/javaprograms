//6.6

import java.util.Scanner;
	public class u1p6_6
	{
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the string:");
			String Userstr=scn.nextLine();
			int num=scn.nextInt();
			scn.close();
			
			
			int i=1;
			do
			 {
              System.out.println(Userstr);
			  i++;
             }
			 while (  i <= num);
			
			
		}
    }