package CourseManagement;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//int[] student1PreReqs = {1,2,3,4}; 
		Student student1 = new Student("student1", "Computer Science", 1); // String name, String major, int ID, int[] completedCourses
		Student student2 = new Student("student2", "Mathematics", 2);
		Instructor instructor1 = new Instructor("Instructor1", "Instructor1@domain.com", "9:00 to 17:00"); // String name, String email, String hours
	
		int[] CSE1PreReqs = {1,2};
		int[] CSE2PreReqs = {1,2,3};
		int[] math1PreReqs = {1};
		int[] math2PreReqs = {1,2};
		programmingCourse CSE1 = new programmingCourse(0, "CSE-1", CSE1PreReqs, "C++"); // int courseID, String courseName, int[] req, String language
		programmingCourse CSE2 = new programmingCourse(1, "CSE-2", CSE2PreReqs, "JavaScript"); 
		mathCourse math1 = new mathCourse(10, "Math-1", math1PreReqs, 1, "math1Textbook"); // ^, ^, ^, int level, String textbook
		mathCourse math2 = new mathCourse(11, "Math-2", math2PreReqs, 2, "math2Textbook");
		
		System.out.println("Select a student: ");
		System.out.println("1. Student 1\n2. Student 2");
		int selectionStudent = input.nextInt();
		System.out.println("Select a course: ");
		System.out.println("1. Computer Science 1\n2. Computer Science 2\n3. Math 1\n4. Math 2");
		int selectionCourse = input.nextInt();		
		
		Student selectedStudent; // placeholders
		Course selectedCourse;
		
		switch(selectionStudent) {
		case 1:
			selectedStudent = student1;
			break;
		case 2:
			selectedStudent = student2;
			break;
		default:
			break;	
		}
		
		switch(selectionCourse) {
		case 1:
			selectedCourse = CSE1;
			break;
		case 2:
			selectedCourse = CSE2;
			break;
		case 3:
			selectedCourse = math1;
			break;
		case 4:
			selectedCourse = math2;
		}
		
		Student.manage
		
		//student1.regCourse(student1, CSE1);
//		instructor1.regCourse(instructor1, CSE1);
	}
}
