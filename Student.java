package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name, major;
	private int ID;
	//private int[] completedCourses; // merged with arraylist courses
	private ArrayList<Student> courses = new ArrayList<Student>(); // courses the student has
	static Scanner input = new Scanner(System.in);
	
	public Student(String name, String major, int ID) {
		this.name = name;
		this.major = major;
		this.ID = ID;
	}
	
	public void manage(Student student, Course course) { // manage student
		System.out.println("Select an option: 1. Register course\n2. Remove course");
		int inputOption = input.nextInt();
		System.out.println("Enter course ID: ");
		int courseIDInput = input.nextInt();
		
		switch (inputOption) {
		case 1:		
			Course.addStudent(student, course); // FIXME 
			break;
		case 2:
			Course.removeStudent(student, course); // FIXME
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public float getGPA(float grade) {
		grade = 4 * (grade / 100);
		return grade;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> courses = new ArrayList<Student>();
		
	}
}
