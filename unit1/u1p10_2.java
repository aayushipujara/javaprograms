import java.util.Scanner;
	
	public class u1p10_2
	{
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			
			
			
            System.out.println("Enter the limit:");
			int n=scn.nextInt();
			scn.close();
        
        for (int i = 1; i <= n; i++) 
		{
            
            for (int j = 1; j <= n - i; j++)
				{
                System.out.print(" ");
                }
            
            
            for (int k = 1; k <= i; k++)
				{
                System.out.print("*");
                }
            

            System.out.println();
        }
    }
}

