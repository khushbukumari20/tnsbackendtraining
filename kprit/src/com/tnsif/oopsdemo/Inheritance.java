package com.tnsif.oopsdemo;

//Parent class (Super class)
class Person {
 String name;
 int age;

 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Child class (Subclass inherits Person)
class Std extends Person {
 String college;

 void displayStudentInfo() {
     // Reuse parent class method
     displayInfo();
     System.out.println("College: " + college);
 }
}
