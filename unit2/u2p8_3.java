final class finalmethod{
        void verify(){System.out.println("This is final class");}
    }
    class finalmethoderror extends finalmethod{
        void verifyagain(){System.out.println("This is subclass");}
    }
public class u2p8_3{
    public static void main(String args[]){
        finalmethoderror fme=new finalmethoderror();
        fme.verify();
        fme.verifyagain();
       //error: cannot inherit from final finalmethod
       
        
        
    }
}
