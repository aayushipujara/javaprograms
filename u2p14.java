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

class puppy extends  dog
{
    
    void weep()
    {
        System.out.println("Puppy is weeping.");
    }
}
public class u2p14
{
    public static void main(String args[])
    {
        puppy p=new puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

