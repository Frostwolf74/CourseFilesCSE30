package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name, major;
	private int ID;
	private int[] completedCourses;	
	private ArrayList<Student> courses = new ArrayList<Student>(); // courses the student has
	static Scanner input = new Scanner(System.in);
	
	public Student(String name, String major, int ID, int[] completedCourses) {
		this.name = name;
		this.major = major;
		this.ID = ID;
		this.completedCourses = completedCourses;
	}
	
	public Student() { // manage student
		System.out.println("Select an option: 1. Register course");
		int inputOption = input.nextInt();
		
		switch (inputOption) {
		case 1:
			regCourse(student.name);
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
	
	public int[] getCompletedCourses() {
		return completedCourses;
	}
	
	public void setCompletedCourses(int[] completedCourses) {
		this.completedCourses = completedCourses;
	}
	
	public float getGPA(float grade) {
		grade = 4 * (grade / 100);
		return grade;
	}
	
	public void regCourse(Student student, Course course) {
		course.addStudent(student);
	}
	
	public static void main(String[] args) {
		ArrayList<Student> courses = new ArrayList<Student>();
		
	}
}
