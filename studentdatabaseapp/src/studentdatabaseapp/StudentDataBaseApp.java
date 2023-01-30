   package studentdatabaseapp;

import java.util.Scanner;

public  class StudentDataBaseApp {

	public static void main(String[] args) 
{
	// Ask how many new student we want to add 
		System.out.print("Enter number of new student to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfstudents = in.nextInt();
		student[] student = new student[numOfstudents];
		
		// Create n number of new students
		for (int n = 0; n < numOfstudents; n++) {
			student[n] = new student();
			student[n].enroll();
			student[n].payTuition();
			
			}
		for (int n = 0; n < numOfstudents; n++) {
			
			System.out.println(student[n].toString());
		}
}
}
