package adhorneIntegration;

import java.util.Scanner;

public class Main {
        //Austin Horne 
	    //Showing off my skills that I learned.
	public static void main(String[] args) {
		System.out.println("Hello World!"); 
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter x1"); // prompt
		//int x1 = scan.nextInt(); // get int input, will crash if input isn't an int
		
		//System.out.println("Enter rate");
		//double rate = scan.nextDouble();
		
		//scan.nextLine();
		
		//System.out.println("What is your name?");
		//String userName = scan.nextLine();
		//System.out.println(userName);
		
		Dog spot = new Dog();
		spot.size = 30;
		spot.breed = "German Shepherd";
		System.out.println(spot.breed);
		
	}

}


class Dog {
    double size; 
	String breed;
	
	
}