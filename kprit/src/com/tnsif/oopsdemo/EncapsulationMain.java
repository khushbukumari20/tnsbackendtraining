package com.tnsif.oopsdemo;

public class EncapsulationMain {

	public static void main(String[] args) {
		 // Creating object of Student
	     Student student = new Student();

	     // Setting values using setter methods
	     student.setName("Khushbu");
	     student.setSid(557);

	     // Getting values using getter methods
	     System.out.println("Student Name: " + student.getName());
	     System.out.println("Student Sid: " + student.getSid());
	 }


}


