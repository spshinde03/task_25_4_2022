package Abstraction;


	// Abstract class
	abstract class Programs {
	  public abstract void programming();
	  public void sleep() {
	    System.out.println("Program");
	  }
	}

	// Subclass (inherit from Animal)
	class Cat extends Programs {
	  public void programming() {
	    System.out.println("This is Abstraction");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Cat myPig = new Cat(); 
	    myPig.programming();
	    myPig.sleep();
	  }
	}

