import java.util.*;


public class Day4ClassVsInstance{
	public  static void main(String[] args) {
		// Write code determining if this person's age is old and print the correct
		// statement: 
		int age = 15;
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");

		} else {
			System.out.println("You are old.");
		}

	}
}
	
