public class u3p2{
    public static void main(String args[]){

        try {
            int scores[] =new int[3];
            scores[0]=95;
            scores[1]=99;
            scores[2]=80;
            scores[5]=100;
           
        } catch(ArithmeticException e){
            System.out.println("Arithmetic error ocurred");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index not found");
        } catch (Exception e) {
            System.out.println("General Exception handler" + e);  
        }
         
    }
}