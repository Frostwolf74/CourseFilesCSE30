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
		programmingCourse CSE1 = new programmingCourse(1, "CSE-1", CSE1PreReqs, "C++"); // int courseID, String courseName, int[] req, String language
		programmingCourse CSE2 = new programmingCourse(2, "CSE-2", CSE2PreReqs, "JavaScript"); 
		mathCourse math1 = new mathCourse(1, "Math-1", math1PreReqs, 1, "math1Textbook"); // ^, ^, ^, int level, String textbook
		mathCourse math2 = new mathCourse(2, "Math-2", math2PreReqs, 2, "math2Textbook");
		
		System.out.println("Select an option: 1. Add a student to a course\n2. Remove a student from a course");
		int selectionMain = input.nextInt();
		
		System.out.println("Select a student: \n1. Student 1 \n2. Student 2");
		int selectionStudent = input.nextInt();
		
		switch(selectionStudent) {
		case 1:
			if(selectionMain == 1) {
				CSE1.addStudent(student1);
			}
			else if(selectionMain == 2) {
				Course.removeStudent(student1);
			}
			break;
		case 2:
			if(selectionMain == 1) {
				Course.addStudent(student2);
			}
			else if(selectionMain == 2) {
				Course.removeStudent(student2);
			}
			break;
		default:
			break;	
		}
	}
}
