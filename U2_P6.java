// Write a java program to use method overriding.

class OverridingA
{
    int a; 
    void sum(int a,int b)
     { System.out.println("The addition :"+ (a + b));}
}

class OverridingB extends OverridingA
{
      int b;
      void sum(int a,int b)
     { System.out.println("The addition :"+ (a + b));}
}

public class U2_P6
{
    public static void main(String args[])
      {
        OverridingB obj = new OverridingB();
        
        obj.sum(1,2);

      } 
}