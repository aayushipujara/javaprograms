//6.4
import java.util.Scanner;
	public class u1p6_4
	{
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the string:");
			String Userstr=scn.nextLine();
			System.out.println("Enter the limit:");

			int num=scn.nextInt();
			scn.close();
			
			
			int i;
			 for ( i=1; i <= num; i++)
			 {
              System.out.println(Userstr);
             }
			
			

  }
}
