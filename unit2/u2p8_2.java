
    class finalmethod{
        final void verify(){System.out.println("This is final class");}
    }
    class finalmethoderror extends finalmethod{
        void verify(){System.out.println("This is for error");}
    }
public class u2p8_2{
    public static void main(String args[]){
        finalmethoderror fme=new finalmethoderror();
        fme.verify();
        //error: verify() in finalmethoderror cannot override verify() in finalmethod
       
        
        
    }
