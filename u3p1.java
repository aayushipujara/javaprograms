public class u3p1{
    public static void main(String args[]){
        String studentname="Vivaan";
        System.out.println(studentname + " started with math calculation");

        try {
            int totalmarks=100;
            int subjects=0;
            int result=totalmarks/subjects;
            System.out.println("result"+ result);
        } catch (Exception e) {
            System.out.println("Exception found: Division by zero not allowed");
            System.out.println("System error detail "+ e.getMessage());
        }
         System.out.println("Program continue smoothly..");
    }
}