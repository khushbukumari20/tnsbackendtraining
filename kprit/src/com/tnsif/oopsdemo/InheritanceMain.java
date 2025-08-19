package com.tnsif.oopsdemo;

public class InheritanceMain {
    public static void main(String[] args) {
        // Creating object of Student
        Std s1 = new Std();

        // Inherited properties
        s1.name = "Khushbu";
        s1.age = 20;
        s1.college = "Kommuri Pratap Reddy Institute Of Technology";

        // Displaying details
        s1.displayStudentInfo();
    }
}