import java.util.Scanner;
	
	public class u1p10_3
	{
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			
			
			
            System.out.println("Enter the limit:");
			int n=scn.nextInt();
			scn.close();
        
        for (int i = n; i >= 1; i--)
		{
             
            for (int j = i; j >= 1;j--)
				{
                System.out.print("*");
                }
            System.out.println("");
        }
    }
}
