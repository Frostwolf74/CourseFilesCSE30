package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static Course selectedCourse = null; // placeholder, initialised as null because java dumb
	
	public static void main(String[] args) {	
		ArrayList<Student> mainStudents	= new ArrayList<Student>(); // all students initialised in main
		ArrayList<Instructor> mainInstructors = new ArrayList<Instructor>(); // all instructors initialised in main
		ArrayList<Course> mainCourses = new ArrayList<Course>(); // all courses initialised in main
		
		// courses guide: 1 = math1, 2 = math2, 3 = CSE1, 4 = CSE2
		
		ArrayList<Course> math1PreReqs = new ArrayList<Course>();
		mainCourses.add(new mathCourse(1, "Math-1", math1PreReqs, 1, "math1Textbook", 20, 2.0));
		ArrayList<Course> math2PreReqs = new ArrayList<Course>();
		math2PreReqs.add(mainCourses.get(1));
		mainCourses.add(new mathCourse(2, "Math-2", math2PreReqs, 2, "math2Textbook", 20, 2.7));
		ArrayList<Course> CSE1PreReqs = new ArrayList<Course>();
		CSE1PreReqs.add(mainCourses.get(1));
		CSE1PreReqs.add(mainCourses.get(2));
		mainCourses.add(new programmingCourse(1, "CSE-1", CSE1PreReqs, "C++", 20, 2.5));
		ArrayList<Course> CSE2PreReqs = new ArrayList<Course>();
		CSE2PreReqs.add(mainCourses.get(1));
		CSE2PreReqs.add(mainCourses.get(2));
		CSE2PreReqs.add(mainCourses.get(3));
		mainCourses.add(new programmingCourse(2, "CSE-2", CSE2PreReqs, "JavaScript", 20, 3.0)); 
		ArrayList<Course> student1PreReqs = new ArrayList<Course>();
		student1PreReqs.add(mainCourses.get(3));
		student1PreReqs.add(mainCourses.get(4));
		student1PreReqs.add(mainCourses.get(1));
		ArrayList<Course> student2PreReqs = new ArrayList<Course>();
		student1PreReqs.add(mainCourses.get(1));
		
		mainStudents.add(new Student(student1PreReqs, "student1", "Computer Science", 1));
		mainStudents.add(new Student(student2PreReqs, "student2", "Mathematics", 2));
		Instructor instructor1 = new Instructor("Instructor1", "Instructor1@domain.com", "9:00 to 17:00"); // String name, String email, String hours
		
		System.out.println("Select an option: \n1. Add a student to a course\n2. Remove a student from a course");
		int selectionMain = input.nextInt();
		
		System.out.println("Select a student: \n1. Student 1 \n2. Student 2");
		int selectionStudent = input.nextInt();
		Student selectedStudent = null; // placeholder for selections
		System.out.println("Select a course: \n1. Computer Science 1\n2. Computer Science 2\n3. Math 1\n4. Math 2");
		int selectionCourse = input.nextInt();
		
		
		
		switch(selectionStudent) {
		case 1:
			selectedStudent = mainStudents.get(1);
			break;
		case 2:
			selectedStudent = mainStudents.get(2);
			break;
		}
		
		switch(selectionCourse) { // FIXME absolute mess
		case 1: // comp sci 1
			selectedCourse = mainCourses.get(3);
			switch(selectionMain) {
			case 1: 
				((mathCourse) mainCourses.get(3)).addStudent(selectedStudent); // go into the course object and add the student
				selectedStudent.addCourse(mainCourses.get(3)); // go into the student object and add the course
				break;
			case 2: 
				((mathCourse) mainCourses.get(3)).removeStudent(selectedStudent); // vice versa 
				break;
			}
			break;
		case 2: // comp sci 2
			selectedCourse = mainCourses.get(4);
			switch(selectionMain) {
			case 1: 
				((mathCourse) mainCourses.get(4)).addStudent(selectedStudent); 
				break;
			case 2: 
				((mathCourse) mainCourses.get(4)).removeStudent(selectedStudent);
				break;
			}
			break;
		case 3: // math 1
			selectedCourse = mainCourses.get(1);
			switch(selectionMain) {
			case 1: 
				((mathCourse) mainCourses.get(1)).addStudent(selectedStudent); 
				break;
			case 2: 
				((mathCourse) mainCourses.get(1)).removeStudent(selectedStudent);  
				break;
			}
			break;
		case 4: // math 2
			selectedCourse = mainCourses.get(2);
			switch(selectionMain) {
			case 1: 
				((mathCourse) mainCourses.get(2)).addStudent(selectedStudent);
				break;
			case 2: 
				((mathCourse) mainCourses.get(2)).removeStudent(selectedStudent); 
				break;
			}
			break;
		}	
	}
}
