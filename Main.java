package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> mainStudents	= new ArrayList<Student>(); // all students initialised in main
	static ArrayList<Instructor> mainInstructors = new ArrayList<Instructor>(); // all instructors initialised in main
	static ArrayList<Course> mainCourses = new ArrayList<Course>(); // all courses initialised in main
	
	public static void mainMenu() {
		System.out.println("Select an option: \n1. Manage students\n2. Manage instructors\n3. View all courses\n4. Leave");
		int mainSelection = input.nextInt();
		int selectionCourse = 0;
		switch(mainSelection) {
		case 1:
			System.out.println("Select an option: \n1. Add a student to a course\n2. Remove a student from a course\n3. View student information");
			int selection = input.nextInt();
			
			if(selection > 3 || selection < 1) {
				System.out.println("\u001B[31m" + "Invalid selection" + "\u001B[0m");
				mainMenu();
			}
			
			System.out.println("Enter student ID: ");
			int selectionStudent = input.nextInt()-1;
			
			if(selectionStudent >= mainStudents.size()) {
				System.out.println("\u001B[31m" + "The selected student does not exist" + "\u001B[0m");
				mainMenu();
			}
			
			if(selection != 3) { // only print course selector if it is requested, only time it is not requested is on option 3
				System.out.println("Select a course: \n1. Math 1\n2. Math 2\n3. Computer Science 1\n4. Computer Science 2");
				selectionCourse = input.nextInt()-1;
			}
			
			manageStudent(selection, mainCourses.get(selectionCourse), mainStudents.get(selectionStudent)); // add or remove, selected course, selected student
			break;
		case 2:
			System.out.println("Select an option: \n1. Add an instructor to a course\n2. Remove an instructor from a course\n3. View instructor information");
			selection = input.nextInt();
			
			if(selection > 3 || selection < 1) {
				System.out.println("\u001B[31m" + "Invalid selection" + "\u001B[0m"); 
				mainMenu();
			}
			
			System.out.println("Select an instructor: \n1. Instructor 1 \n2. Instructor 2");
			int selectionInstructor = input.nextInt()-1;
			
			if(selectionInstructor >= mainInstructors.size()) {
				System.out.println("\u001B[31m" + "The selected instructor does not exist" + "\u001B[0m");
				mainMenu();
			}
			
			if(selection != 3) {
				System.out.println("Select a course: \n1. Math 1\n2. Math 2\n3. Computer Science 1\n4. Computer Science 2");
				selectionCourse = input.nextInt()-1;
			}
			
			manageInstructor(selection, mainCourses.get(selectionCourse), mainInstructors.get(selectionInstructor));
			break;
		case 3: // printing course info
			for(int i = 0; i < mainCourses.size(); i++) {
				mainCourses.get(i).printAll(i); // i is the course index, prints all course info
				
				if(mainCourses.get(i) instanceof programmingCourse) { // prints instructors 
					if(((programmingCourse) mainCourses.get(i)).getInstructor() != null) {
						((programmingCourse) mainCourses.get(i)).printStudents();	
						((programmingCourse) mainCourses.get(i)).printInstructor();			
					}
					else {
						System.out.println("There are no instructors assigned to this course");
					}
				}
				if(mainCourses.get(i) instanceof mathCourse) {
					if(((mathCourse) mainCourses.get(i)).getInstructor() != null) {
						((mathCourse) mainCourses.get(i)).printStudents();
						((mathCourse) mainCourses.get(i)).printInstructor();
						
					}
					else {
						System.out.println("There are no instructors assigned to this course");
					}
				}
				
				System.out.println("-----------------------------------------------\n");
			}
			mainMenu();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("\u001B[31m" + "Invalid selection" + "\u001B[0m");
			mainMenu();
		}
	}
	
	public static void main(String[] args) {		
		// courses guide: 0 = math1, 1 = math2, 2 = CSE1, 3 = CSE2
	
		mainInstructors.add(new Instructor("Instructor 1", "Instructor1@domain.com", "9:00 to 17:00"));
		mainInstructors.add(new Instructor("Instructor 2", "Insturctor2@domain.com", "9:00 to 17:00"));
		
		ArrayList<Course> math1PreReqs = new ArrayList<Course>();
		mainCourses.add(new mathCourse(1, "Math-1", math1PreReqs, 1, "math1Textbook", 30, 2.0, mainInstructors.get(1)));
		mainInstructors.get(1).addCourse(mainCourses.get(0));
		ArrayList<Course> math2PreReqs = new ArrayList<Course>();
		math2PreReqs.add(mainCourses.get(0));
		mainCourses.add(new mathCourse(2, "Math-2", math2PreReqs, 2, "math2Textbook", 30, 2.7, mainInstructors.get(1)));
		mainInstructors.get(1).addCourse(mainCourses.get(1));
		ArrayList<Course> CSE1PreReqs = new ArrayList<Course>();
		CSE1PreReqs.add(mainCourses.get(0));
		CSE1PreReqs.add(mainCourses.get(1));
		mainCourses.add(new programmingCourse(1, "CSE-1", CSE1PreReqs, "C++", 20, 2.5, mainInstructors.get(0)));
		mainInstructors.get(0).addCourse(mainCourses.get(2));
		ArrayList<Course> CSE2PreReqs = new ArrayList<Course>();
		CSE2PreReqs.add(mainCourses.get(0));
		CSE2PreReqs.add(mainCourses.get(1));
		CSE2PreReqs.add(mainCourses.get(2));
		mainCourses.add(new programmingCourse(2, "CSE-2", CSE2PreReqs, "JavaScript", 20, 3.0, mainInstructors.get(0)));
		mainInstructors.get(0).addCourse(mainCourses.get(3));
		ArrayList<Course> student1PreReqs = new ArrayList<Course>();
		student1PreReqs.add(mainCourses.get(2));
		student1PreReqs.add(mainCourses.get(3));
		student1PreReqs.add(mainCourses.get(0));
		ArrayList<Course> student2PreReqs = new ArrayList<Course>();
		student2PreReqs.add(mainCourses.get(0));
		student2PreReqs.add(mainCourses.get(1));
		ArrayList<Course> allPreReqs = new ArrayList<Course>();
		allPreReqs.add(mainCourses.get(0));
		allPreReqs.add(mainCourses.get(1));
		allPreReqs.add(mainCourses.get(2));
		allPreReqs.add(mainCourses.get(3));
		
		mainStudents.add(new Student(student1PreReqs, "Student 1", "Computer Science", 1, 3.0));
		mainStudents.add(new Student(student2PreReqs, "Student 2", "Mathematics", 2, 2.0));
		mainStudents.add(new Student(student2PreReqs, "Student 3", "Computer Science", 3, 4.0));
		mainStudents.add(new Student(student2PreReqs, "Student 4", "None", 4, 1.0));
		
//		for(int i = 4; i < 20; ++i) { // XXX debug to fill course with students
//			mainStudents.add(new Student(allPreReqs, "Student " + i, "Computer Science", i+4, 3.0));
//			((programmingCourse) mainCourses.get(3)).addStudent(mainStudents.get(i)); 
//		}
	
		mainMenu();
	}
	
	public static void manageStudent(int selection, Course selectedCourse, Student student) {		
		switch(selection) {
		case 1:  // add student to a course/add course to a student
			if(selectedCourse instanceof mathCourse) {
				((mathCourse) selectedCourse).addStudent(student); 
			}
			else if(selectedCourse instanceof programmingCourse) {
				((programmingCourse) selectedCourse).addStudent(student); 
			}
			break;
		case 2: // remove student from a course
			if(selectedCourse instanceof mathCourse) {
				((mathCourse) selectedCourse).removeStudent(student); 
				student.removeCourse(selectedCourse);
			}
			else if(selectedCourse instanceof programmingCourse) {
				((programmingCourse) selectedCourse).removeStudent(student); 
				student.removeCourse(selectedCourse);
			}
			break;
		case 3: // print student information
			System.out.println(
					"Name: " + student.getName() +
					"\nID: " + student.getID() +
					"\nMajor: " + student.getMajor() +
					"\nGPA: " + student.getGPA()
			);
		
			System.out.println("\nCourses:");
			for(int i = 0; i < student.getCourses().size(); ++i) {
				System.out.println(student.getCourses().get(i).getCourseName());
			}
			
			if(student.getCourses().size() == 0) {
				System.out.println("Student is not enrolled in any courses");
			}
		}
		System.out.println("\n");
		
		mainMenu();
	}
	
	public static void manageInstructor(int selection, Course selectedCourse, Instructor instructor) {
		switch(selection) {
		case 1: 
			if(selectedCourse instanceof mathCourse) {
				((mathCourse) selectedCourse).setInstructor(instructor); 
			}
			else if(selectedCourse instanceof programmingCourse) {
				((programmingCourse) selectedCourse).setInstructor(instructor); 
			}
			break;
		case 2: 
			if(selectedCourse instanceof mathCourse) {
				((mathCourse) selectedCourse).setInstructor(null); 
			}
			else if(selectedCourse instanceof programmingCourse) {
				((programmingCourse) selectedCourse).setInstructor(null); 
			}
			break;
		case 3:
			System.out.println(
					"Name: " + instructor.getName() +
					"\nEmail: " + instructor.getEmail() +
					"\nHours: " + instructor.getHours()
			);
			
			System.out.println("\nCourses:");
			for(int i = 0; i < instructor.getCourses().size(); ++i) {
				System.out.println(instructor.getCourses().get(i).getCourseName());
			}
			
			if(instructor.getCourses().size() == 0) {
				System.out.println("Instructor is not assigned to any courses");
			}
		}
		System.out.println("\n");
		
		mainMenu();
	}
}
