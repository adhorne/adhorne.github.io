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
		//Primitive types are the most basic data types available within the Java language. There are 8: boolean, byte, char, short, int, long, float and double. These types serve as the building blocks of data manipulation in Java. Such types serve only one purpose — containing pure, simple values of a kind. Because these data types are defined into the Java type system by default, they come with a number of operations predefined. You can not define a new operation for such primitive types. In the Java type system, there are three further categories of primitives.
                //Numeric primitives: short, int, long, float and double. These primitive data types hold only numeric data. Operations associated with such data types are those of simple arithmetic (addition, subtraction, etc.) or of comparisons (is greater than, is equal to, etc.)
                //Textual primitives: byte and char. These primitive data types hold characters (that can be Unicode alphabets or even numbers). Operations associated with such types are those of textual manipulation (comparing two words, joining characters to make words, etc.). However, byte and char can also support arithmetic operations.
                //Boolean and null primitives: boolean and null (true and false). 
		
		Dog casey = new Dog();
		String breed = "beagle";
		casey.weight = (int) 21.5;
		casey.age = 14;
		System.out.println(breed.toUpperCase().charAt(0)+breed.substring(1));
		System.out.println(casey.weight);
		System.out.println(casey.age);
	}

}


class Dog {
    double weight; 
	int age; 
	
	
	
}
