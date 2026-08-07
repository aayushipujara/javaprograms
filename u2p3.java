//Write a java program to use hierarchical inheritance.

class Animal{
    void eat (){
          System.out.println("This animal eats food.");
    }
  
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks:Woof!Woof!");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("The cat:Meow!Meow!.");
    }
}

public class u2p3{
    public static void main(String args[]){
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        d.bark();
        c.eat();
        c.meow();
    }
}
