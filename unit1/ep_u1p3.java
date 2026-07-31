//Swap

public class ep_u1p3
 {
    public static void main(String args[])
	{
        
        int a = 10;
        int b = 20;
        System.out.println("With Temp Variable");
        System.out.println("Before value of a = " + a +"\n");
        System.out.println("Before value of b = " + b +"\n" );

        int temp = a; 
        a = b;        
        b = temp;
	    	System.out.println("After value of a = " + a +"\n");
        System.out.println("After value of b = " + b +"\n" );

        

        //without
        int x = 50;
        int y = 60;
        System.out.println(" Without Temp Variable ");
        System.out.println("Before value of x = " + x +"\n");
        System.out.println("Before value of y = " + y +"\n" );
        x = x + y;
        y = x - y; 
        x = x - y; 
        System.out.println("After value of x = " + x +"\n");
        System.out.println("After value of y = " + y +"\n" );
        

    }
}
