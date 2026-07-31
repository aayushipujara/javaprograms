import java.util.Scanner;

public class ep_u1p7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        System.out.print("Enter the number c: ");
        int c = sc.nextInt();
        
      
        if (a >= b && a >= c)
			{
            System.out.println(a + " is greatest");
        }
		else if (b >= a && b >= c) 
		{
            System.out.println(b + " is greatest");
        } 
		else
			{
            System.out.println(c + " is greatest");
      	   }
        
        if (a <= b && a <= c) 
		{
            System.out.println(a + " is smallest");
        }
		else if (b <= a && b <= c)
			{
            System.out.println(b + " is smallest");
        } 
		else 
		{
            System.out.println(c + " is smallest");
        }
        
        sc.close(); 
    }
}
