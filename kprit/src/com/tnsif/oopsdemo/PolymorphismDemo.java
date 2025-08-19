package com.tnsif.oopsdemo;

	// Polymorphism Example in Java
  //Runtime- Mrthod overriding
	// Parent class
	class Animal {
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	// Child class 1
	class Dog extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	// Child class 2
	class Cat extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}


	
	//Compile time -Method overloading
	class Sum {
	    // add method with 2 parameters
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // add method with 3 parameters (overloaded method)
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	}
