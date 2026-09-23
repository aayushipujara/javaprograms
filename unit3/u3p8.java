public class u3p8{
    public static void main(String args[])
    {
        try
        {
            method1();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception caught in main: "+ e);
        }

    }
    public static void method1()
    {
        method2();
    }
    public static void method2()
    {
        method3();
    }
    public static void method3()
    {
        int result=10/0;
    }
}
