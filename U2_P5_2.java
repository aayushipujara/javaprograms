//Write a program to use method overloading but change the data type.

class MethodOverloading
{
     void sum(int a,int b)
    { System.out.println("Sum of 2 :"+ (a + b));}
   
    void sum(double a,double  b,double  c)
    { System.out.println("Sum of 3  :"+ (a + b+c));}

}

public class U2_P5_2
{
    public static void main(String args[])
      {
        MethodOverloading obj = new MethodOverloading();
        
        obj.sum(1,2);
        obj.sum(1.5,2.6,3.4);

      } 
}