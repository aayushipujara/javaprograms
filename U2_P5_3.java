//Write a program to use method overloading but take values from user.

import java.util.Scanner;

public class U2_P5_3 
{

    void sum(int a, int b) {
        System.out.println("Sum of 2 :" + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of 3  :" + (a + b + c));
    }

    public static void main(String args[])
     {

        U2_P5_3 o = new U2_P5_3();

        Scanner scn = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter value 1 :");
        a = scn.nextInt();
        System.out.println("Enter value 2 :");
        b = scn.nextInt();
        System.out.println("Enter value 3 :");
        c = scn.nextInt();

        o.sum(a, b);
        o.sum(a, b, c);

    }
}
