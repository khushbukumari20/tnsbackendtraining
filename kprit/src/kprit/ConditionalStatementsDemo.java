package kprit;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {
		// lets start with if statement
		int i = 50;
		if(i>0) {
			System.out.println("The Given Number "+ i + " is Positive.");
		}
		
		//if-else statements
		int age =21;
		
		if(age>=18) {
			System.out.println("The candidate is Eligible to vote");
		}
		else {
				System.out.println("The candidate is not  Eligible to vote");
			
		}
		//if-else if-else statement
		
		int marks = 101;
		
		  if(marks >=91 && marks <=100) {
			System.out.println("Grade A");
		  } else if(marks >=81 && marks<= 90) {
				 System.out.println("Grade B");
		  } else if (marks >=71 && marks <=80) {
		    	 System.out.println("Grade C");
		  } else if (marks>=61 && marks <=70) {
		    	 System.out.println("Grade D");
		  } else if(marks<=60) {
		    	 System.out.println("Grade E");
		  } else {
		     System.out.println("entered marks are invalid");
	     }
	}
}
		     

