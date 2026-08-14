// Write a java program to use method overloading.

class Overloading
{
    void sum(int a,int b)
    { System.out.println("Sum of 2 :"+ (a + b));}
   
    void sum(int a,int b,int c)
    { System.out.println("Sum of 3  :"+ (a + b+c));}

}

public class U2_P5_1
{
    public static void main(String args[])
      {
        Overloading obj = new Overloading();
        
        obj.sum(1,2);
        obj.sum(1,2,3);

      } 
}