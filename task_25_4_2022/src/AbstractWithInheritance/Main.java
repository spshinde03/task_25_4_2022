package AbstractWithInheritance;

public class Main {

	public static void main(String args[]) {
		Dog myDog=new Dog("Spike",2);
		Cat myCat=new Cat("Fwuffy",3);
		
		myDog.speak();
		myCat.speak();
	}
}
