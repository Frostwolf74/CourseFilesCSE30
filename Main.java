package CourseManagement;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static Course selectedCourse = null; // placeholder, initialised as null because java dumb
	
	public static void main(String[] args) {
		int[] student1PreReqs = {1,2,3,4}; // FIXME refactor to use a list of COURSE OBJECTS NOT INTEGERS
		int[] student2PreReqs = {1};
		
		Student student1 = new Student(student1PreReqs, "student1", "Computer Science", 1); // String name, String major, int ID, int[] completedCourses
		Student student2 = new Student(student2PreReqs, "student2", "Mathematics", 2);
		Instructor instructor1 = new Instructor("Instructor1", "Instructor1@domain.com", "9:00 to 17:00"); // String name, String email, String hours
	
		int[] CSE1PreReqs = {1,2};
		int[] CSE2PreReqs = {1,2,3};
		int[] math1PreReqs = {1};
		int[] math2PreReqs = {1,2};
		programmingCourse CSE1 = new programmingCourse(1, "CSE-1", CSE1PreReqs, "C++"); // int courseID, String courseName, int[] req, String language
		programmingCourse CSE2 = new programmingCourse(2, "CSE-2", CSE2PreReqs, "JavaScript"); 
		mathCourse math1 = new mathCourse(1, "Math-1", math1PreReqs, 1, "math1Textbook"); // ^, ^, ^, int level, String textbook
		mathCourse math2 = new mathCourse(2, "Math-2", math2PreReqs, 2, "math2Textbook");
		
		System.out.println("Select an option: \n1. Add a student to a course\n2. Remove a student from a course");
		int selectionMain = input.nextInt();
		
		System.out.println("Select a student: \n1. Student 1 \n2. Student 2");
		int selectionStudent = input.nextInt();
		Student selectedStudent = null; // placeholder for selections
		System.out.println("Select a course: \n1. Computer Science 1\n2. Computer Science 2\n3. Math 1\n4. Math 2");
		int selectionCourse = input.nextInt();
		// placeholder for course is global, line 87
		
		switch(selectionStudent) { // TODO refactor later into an arraylist of student objects
		case 1:
			selectedStudent = student1;
			break;
		case 2:
			selectedStudent = student2;
			break;
		}
		
		switch(selectionCourse) { // FIXME absolute mess
		case 1: // comp sci 1
			selectedCourse = CSE1;
			switch(selectionMain) {
			case 1: 
				CSE1.addStudent(selectedStudent); // go into the course object and add the student
				break;
			case 2: 
				CSE1.removeStudent(selectedStudent); // vice versa 
				break;
			}
			break;
		case 2: // comp sci 2
			selectedCourse = CSE2;
			switch(selectionMain) {
			case 1: 
				CSE2.addStudent(selectedStudent); 
				break;
			case 2: 
				CSE2.removeStudent(selectedStudent);
				break;
			}
			break;
		case 3: // math 1
			selectedCourse = math1;
			switch(selectionMain) {
			case 1: 
				math1.addStudent(selectedStudent); 
				break;
			case 2: 
				math1.removeStudent(selectedStudent);  
				break;
			}
			break;
		case 4: // math 2
			selectedCourse = math2;
			switch(selectionMain) {
			case 1: 
				math2.addStudent(selectedStudent);
				break;
			case 2: 
				math2.removeStudent(selectedStudent); 
				break;
			}
			break;
		}	
	}
	
	public static Course getSelectedCourse() {
		return selectedCourse;
	}
}
