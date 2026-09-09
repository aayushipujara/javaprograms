interface PetAnimal
{
   void weep();
}
class Animal
{
    void eat ()
    {
          System.out.println("animal eats food.");
    }
  
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("The dog barks:Woof!Woof!");
    }
}

class Puppy extends Dog implements PetAnimal
{
    public void weep()
    {
        System.out.println("Puppy is weeping.");
    }

    void sleep()
    {
        System.out.println("zzzzzzzz");
    }
    
}
public class U2_P12
{
    public static void main(String[] args)
     {
        Puppy p = new Puppy();

        p.eat();
        p.weep();
        p.bark();
        p.sleep();
    }
}
