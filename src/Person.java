
//imported Scanner library for userInput
import java.util.Scanner;

public class Person {
	//Constructor created for Scanner class
	Scanner sc = new Scanner(System.in);

	//variables initialized
	public int Age;
	public String Name;
	public String Surname;
	public char Gender;
	public int options;



	//attributes method will prompt user to enter values and print out results
	void attributes(){
		System.out.println("************************GOOD DAY*************************");
		System.out.println("ENTER YOUR NAME >> ");
		Name = sc.nextLine();
		System.out.println("ENTER YOUR SURNAME >> ");
		Surname = sc.nextLine();
		System.out.println("ENTER YOUR AGE >> ");
		Age = sc.nextInt();
		System.out.println("ENTER YOUR GENDER IF YOU ARE MALE TYPE(M) IF YOUR FEMALE TYPE(F) >> ");
		Gender = sc.next().charAt(0);


	}
	void print(){
		System.out.println("IF YOU WOULD LIKE TO PRINT OUT THE DATA PRESS (1) IF YOU WOULD LIKE TO QUIT PROGRAM PRESS (2)");
		options = sc.nextInt();
		if(options == 1){
			System.out.println("************************DETAILS OF "+Name +" "+ Surname+"*************************");
			System.out.println("NAME >>> " +Name);
			System.out.println("SURNAME >>> " +Surname);
			System.out.println("AGE >>> " +Age);
			System.out.println("GENDER >>> " +Gender);
			System.out.println("************************GOOD DAY*************************");
		}
		else{
			System.out.println("************************GOOD DAY*************************");
			int i = 0;
			System.exit( i);
		}
	}
}
