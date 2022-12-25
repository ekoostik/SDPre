import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args){
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		double answer = 0.0;

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    
    System.out.println("Please enter a number:");
    		num1 = kb.nextDouble();
    

    // Part 2:
    // Prompt the user for another number and store their input in num2
    
    System.out.println("Please enter a second number:");
    		num2 = kb.nextDouble();

    

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			int choice = kb.nextInt();

		double sum = findSum(num1, num2);
    double average = findAverage(num1, num2);
    double tax = calcTax(num1, num2);

			switch(choice) {
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!
      
      case 1:
      		System.out.println(num1 + " + " + num2 + " = " + sum);
      		break;
      case 2:
      		System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
      		break;
      case 3:
      		System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + tax);
      		break;
      case 4:
      		System.out.println("You've chosen to quit.");
      		break;
      default: 
      		System.out.println("Invalid entry. Please try again");
      			
      		}
      	}
		kb.close();

		
	}
	public static void printMenu(){
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	  }
	  public static double findSum(double x, double y){
    double sum = x + y;
    return sum;
	  }
	  public static double findAverage(double a, double b){
 		double average = (a + b) / 2;
 		return average;
    }
    public static double calcTax(double n, double m){
 		double tax = (n + m) * .0831;
 		return tax;
    }

}