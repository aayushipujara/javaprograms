class Myexception extends Exception{
   public Myexception(String message){
    super(message);
   }
}
class exceptionchaining{
    void method1() throws Myexception{
        throw new Myexception("Exception from method 1");
    }
    void method2() throws Myexception{
        try {
           method1(); 
        } catch (Myexception e) {
          throw new Myexception("Exception from method 2");  
        }
    }
    void method3(){
        try {
           method2(); 
        } catch (Myexception e) {
           System.out.println("Exception caught in method3: "+ e.getMessage());
           if (e.getCause()!=null)
           {
            System.out.println("Chained exception:" + e.getCause().getMessage());
           }  
        }

    }
}
public class u3p9{
    public static void main(String args[])
    {
        exceptionchaining ec= new exceptionchaining();
        ec.method3();

    }
}
