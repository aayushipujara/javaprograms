//Write a java program to perform overriding of abstract class.
abstract class Animal
{
    abstract void sound();
}


class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class u2_p11
{
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.sound();
    }
}
