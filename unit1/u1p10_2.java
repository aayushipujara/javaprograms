import java.util.Scanner;

public class u1p10_2 
{
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter the number of students: ");
        int limit = scn.nextInt();
        int scores[] = new int[limit]; 
        
        
        System.out.println("Enter the marks:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scn.nextInt(); 
        }
        
        System.out.println("User assigned array elements:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        
        scn.close(); 
    }
}
