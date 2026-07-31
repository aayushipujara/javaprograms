import java.util.Scanner;

public class u1p11_2
 {
    public static void main(String args[])
	{
        Scanner scn = new Scanner(System.in);
        String marks[][] = new String[3][3];
   
        for (int i = 0; i < 3; i++)
		{
            
            for (int j = 0; j <3; j++) 
			{
                System.out.print("Enter Marks for Student "+(i+1)+" in Subject "+(j+1)+":" );
                marks[i][j] = scn.nextLine();
            }
        }
        
       
        
        for (int i = 0; i < 3; i++)
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
        
        
       scn.close();
    }
}
