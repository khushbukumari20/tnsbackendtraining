package kprit;

public class TypeCastingDemo {
	public static void main(String[] args) {
		int x = 10;
		double y = x;
		//implicit type casting
		System.out.println("implicit Type Casting: "+ y);
		
		double a = 9.7;
		//explicit type casting
		int b = (int) a;
		System.out.println("Explicit Type Casting: "+ b);
	}
}
