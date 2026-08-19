abstract class Animal{
    abstract void animalsound();
    
    public void sleep(){
        System.out.println("Zzzzz");
    }
}

class Cat extends Animal{
    public void animalsound(){
        System.out.println("meow meow");
    }
}

class u2p7{
    public static void main(String args[]){
        Cat t=new Cat();
        t.animalsound();
        t.sleep();
    }
}
