//Write a java program to use 1 package.
package add;

class addition
{
   int a=10,b=20;
    void add()
    {
        System.out.println("The addition :"+ (a + b));
    }
}


public class U2_P15
{
        public static void main(String args[])
        {
            addition a = new addition();

           a.add();

        }
}
