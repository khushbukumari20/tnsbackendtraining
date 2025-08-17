package kprit;

public class LoopsDemo {

	public static void main(String[] args) {
		//for loop
		System.out.println("\nfor loop example:");
		int n = 5;//multiples of 5 
		System.out.println("The multiplication Table of " + n+ " is:");
		for (int i = 1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+(n*i));
		}

		System.out.println("\n-----------------------------------");
		//while loop
		System.out.println("\nwhile loop example:");
		int x=1;
		while(x<=5) {
			System.out.println("x = "+x);
			x++;
		}
		System.out.println("\n-----------------------------------");
		//do while loop
		System.out.println("\ndo while loop example:");
		int k =1;
		do {
			System.out.println("k = "+k);
			k++;
		} while(k<=5);
		
	}

}
