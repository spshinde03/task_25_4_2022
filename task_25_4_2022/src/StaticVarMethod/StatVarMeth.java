package StaticVarMethod;

public class StatVarMeth {
		   static int x = 700;
		   static int y;
		   static void func(int z) {
		      System.out.println("x = " + x);
		      System.out.println("y = " + y);
		      System.out.println("z = " + z);
		   }
		   static {
		      System.out.println("static block.");
		      y = x + 500;
		   }
		   public static void main(String args[]) {
		      func(90);
		   }
		
}
