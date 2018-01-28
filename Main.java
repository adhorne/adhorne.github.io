package adhorneIntegration;

import java.util.Scanner;

public class Main {
        //Austin Horne 
	    //Showing off my skills that I learned.
	public static void main(String[] args) {
		//System.out.println("Hello World!"); 
		
		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter x1"); // prompt
		//int x1 = scan.nextInt(); // get int input, will crash if input isn't an int
		
		//System.out.println("Enter rate");
		//double rate = scan.nextDouble();
		
		//scan.nextLine();
		
		//System.out.println("What is your name?");
		//String userName = scan.nextLine();
		//System.out.println(userName); 
		
		//Variable is a value that can be changed.
		//
		
		Dog casey = new Dog();
		String breed = "beagle";
		casey.weight = 31.5;
		casey.age = 15;
		System.out.println(breed.toUpperCase().charAt(0)+breed.substring(1));
		System.out.println(casey.weight);
		System.out.println(casey.age);
	}

}


class Dog {
    double weight; 
	int age; 
	
	
	
}