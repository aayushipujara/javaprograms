//Divisibility
public class ep_u1p5 {
    public static void main(String[] args) {
        System.out.println(" Numbers Divisible by 3 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\n Numbers Divisible by 5 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\n Numbers Divisible by Both  ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
