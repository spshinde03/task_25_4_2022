package Overloading;

public class Overload {

	private static void display(int a){
        System.out.println("Value: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Values: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(30);
        display(30, 200);
    }
}