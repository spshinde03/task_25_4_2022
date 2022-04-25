package ConstructorOverloading;

public class CO {

    int  value1;
    int  value2;
    CO(){
       value1 = 500;
       value2 = 1000;
       System.out.println("Constructor Overloading : ");
   }

   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }

 public static void main(String args[]){
	 CO d1 = new CO();
    d1.display();
}
}
