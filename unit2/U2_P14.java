//Write a java program to use multiple inheritance using interfaces.
interface PetAnimal {
    void eat();
}

interface Animal extends PetAnimal {
    void sleep();
}

class Dog implements Animal 
{

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void sleep() {
        System.out.println("Zzzzzzzz");
    }

    void bark() {
        System.out.println("Dog barks:Woof!Woof");
    }

    
}
public class U2_P14
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}