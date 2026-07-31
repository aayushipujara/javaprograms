//Negative Positive
import java.util.Scanner;
public class ep_u1p6
{
   public static void main(String args[])
   {
	 
	 Scanner sc = new Scanner(System.in);
        
     System.out.print("Enter the number: ");
     int i = sc.nextInt();
	 if (i<0)
	 {
		  System.out.println("Number is Negative");
	 }
	 else if(i>0)
	 {
		  System.out.println("Number is Positive");
	 }
	 else 
	 {
		  System.out.println("Number is 0");
	 }
     sc.close();
   }
}  
