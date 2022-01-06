import java.util.*;
// import Person.Student;

class Person {
	public static final String Student = null;
	int age;
	String color;
	String type;
	int id;
	String firstName;
	String lastName;

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
	
class Student extends Person {
 int testScores=23;
 String firstName="Chatru";
 String lastName="Prasad";
 int id =8;
 int sum;
 int avg;

	public  float printCal(){
		int sum = 2;
		for (int i = 0; i < testScores; i++) {
			sum += testScores;
		}
		int avg = (sum) / testScores;

		if (90 <= avg && avg <= 100) {
			System.out.println("O");
		} else if (80 <= avg && avg < 90) {
			System.out.println("E");
		} else if (70 <= avg && avg < 80) {
			System.out.println("A");
		} else if (55 <= avg && avg < 70) {
			System.out.println("P");
		} else if (40 <= avg && avg < 55) {
			System.out.println("D");
		} else {
			System.out.println("T");
		}
		this.testScores=testScores;
		this.sum=sum;
		return this.avg=avg;

	}

	}
}



public class Studentjava {
    public static void main(String args[]) {
        Person person1 = new Person();
		person1.color = "blue";
       person1.type = "male";
	   person1.PrintColor();
	   person1.differ(23);
		person1.PrintColor();
	   
		Student student1 = new Student();
		
		  


 
	   
	
	   
	   
	  
        
       

    }

	public Studentjava() {
	}

	public Studentjava() {
	}

	

}

