package kprit;

public class VariableDemo {

		int a = 100; //instance variable
		static int b = 20; //static variable
		public void show() {
			String c ="Khushbu Kumari"; //local variable
		System.out.println(" Instance variable:  "+ a);
		System.out.println(" Static variable:  "+ b);
		System.out.println("Local Variable: "+ c);
		
		}
		public static void main(String[] args) {
			VariableDemo ob = new VariableDemo();//creating an object
			ob.show();
	}

}
