import java.util.Scanner;

public class u1p11_2
 {
    public static void main(String[] args)
	{
        Scanner scn = new Scanner(System.in);
        String[][] score = new String[5][5];
   
        for (int i = 0; i < 5; i++)
		{
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            score[i][0] = scn.nextLine();
            for (int j = 1; j <= 4; j++) 
			{
                System.out.print("Enter Marks for Subject " + j + ": ");
                score[i][j] = scn.nextLine();
            }
        }
        
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.println("Name\t\t| Marks1\t| Marks2\t| Marks3\t| Marks4\t|");
        System.out.println("--------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < 5; i++)
		{
            for (int j = 0; j < 5; j++) 
			{
                System.out.print(score[i][j] + "\t\t| ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
        
       scn.close();
    }
}
