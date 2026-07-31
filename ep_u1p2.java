import java.util.Scanner;

public class ep_u1p2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter l of the rectangle: ");
        double l = sc.nextDouble();
        
        System.out.print("Enter w of the rectangle: ");
        double w = sc.nextDouble();
        
        double ra = l * w;
        double rp = 2 * (l + w);
        
        System.out.println("Rectangle Area: " + ra);
        System.out.println("Rectangle Perimeter: " + rp);
        System.out.println();
        
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        
        double ca = 3.14 * radius * radius;
        double cp = 2 * 3.14 * radius;
        
        System.out.println("Circle Area: " + ca);
        System.out.println("Circle Perimeter : " + cp);
        
        sc.close();
    }
}
