package com.tnsif.oopsdemo;

public class PolymorphismDemoMain {

	public static void main(String[] args) {
		        // Runtime Polymorphism-overriding main
		        Animal a1 = new Dog();  // Animal reference but Dog object
		        Animal a2 = new Cat();  // Animal reference but Cat object

		        // Calling overridden methods
		        a1.sound();  // Output: Dog barks
		        a2.sound();  // Output: Cat meows
		        
		        
		        
		        //compile time -overloading main
		        Sum obj = new Sum();
		        System.out.println("Addition of 2 numbers: " + obj.add(10, 20));
		        System.out.println("Addition of 3 numbers: " + obj.add(10, 20, 30));

	}

}
