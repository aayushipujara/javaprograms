//Write a java program to use interface.
interface dog{
	void sounddog();
	void eat();
	
	
}
interface cat extends dog{
	void soundcat();
	void drink();
}
class puppy implements cat,dog{
	 
	public void eat(){
		System.out.println("eat bread");
	}
	public void drink(){
		System.out.println("milk");
	}
	public void sounddog(){
		System.out.println("Woof...Woof...");
     }
	 public void soundcat(){
		System.out.println("Meow...Meow..."); 
	 }
}

public class U2_P9{
	public static void main(String args[]){
		puppy mypuppy = new puppy();
		
		mypuppy.soundcat();
		mypuppy.drink();
		mypuppy.sounddog();
		mypuppy.eat();
	}
}