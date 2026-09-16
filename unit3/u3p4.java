public class u3p4{
    static void voting(int age,String name){
        if (age<18){
        throw new ArithmeticException(name +" not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
         
        }
        public static void main(String args[]){
            try {
                System.out.println("Checking age");
                voting(16,"Vivaan");
            } catch (ArithmeticException e) {
                System.out.println("Caught explicit Exception" + e.getMessage());
            }
        }
    }
