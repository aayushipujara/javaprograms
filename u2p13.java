class animal
{
    String name="Animal";
    void eat()
    {
        System.out.println("This animal eats food.");
    }
}

class dog extends  animal
{
    
    void bark()
    {
        System.out.println("Dog barks woof woof.");
    }
}

public class u2p13
{
    public static void main(String args[])
    {
        dog mydog=new dog();
        mydog.eat();
        mydog.bark();
    }
}


    