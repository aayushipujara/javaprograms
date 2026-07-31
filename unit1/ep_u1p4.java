//ODD EVEN
import java.util.Scanner;
public class ep_u1p4
{
   public static void main(String args[])
   {
	 
	 Scanner sc = new Scanner(System.in);
        
     System.out.print("Enter the number: ");
     int i = sc.nextInt();
	 if (i%2==0)
	 {
		  System.out.println("Number is even");
	 }
	 else
	 {
		  System.out.println("Number is odd");
	 }
     sc.close();
   }
}  
