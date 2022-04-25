package Constructor;

public class Construct {
		  private String name;

		  // constructor
		  Construct() {
		    System.out.println("Java");
		    name = "Constructor";
		  }

		  public static void main(String[] args) {

		  
			  Construct obj = new Construct();
		    System.out.println("Program is for " + obj.name);
		  }
		}

