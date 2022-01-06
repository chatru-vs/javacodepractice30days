import java.util.*;
class Person {
	int age;
	String color;
	String type;

	public void differ(int age) {
		if (age < 10) {
			System.out.println("Age is not valid, setting age to 0.");
		}
		else if (age >= 13 && age < 18) {
			System.out.println("You are a welcome.");

		} else {
			System.out.println("You are adult.");
		}
		this.age = age;

				// Add some more code to run some checks on initialAge
	}

	public void PrintColor() {
        System.out.println("Writing something");
    }

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct
		// statement:
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");

		} else {
			System.out.println("You are old.");
		}

	}

	public void yearPasses() {
		// Increment this person's age.
		this.age++;
	}
}

public class Day4ClassVsInstance {
    public static void main(String args[]) {
        Person person1 = new Person();
		person1.color = "blue";
       person1.type = "male";
	   person1.PrintColor();
	   person1.differ(14);;
	   person1.amIOld();
        
       

    }

}
