package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name, major;
	private int ID;
	//private int[] completedCourses; // merged with arraylist courses
	private ArrayList<Student> courses = new ArrayList<Student>(); // courses the student has
	static Scanner input = new Scanner(System.in);
	
	public Student(String name, String major, int ID, ArrayList<Student> courses) {
		this.name = name;
		this.major = major;
		this.ID = ID;
		this.courses = courses;
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
	
	public ArrayList<Student> getAllCourses() {
		return courses;
	}
	
	public Student getCourses(int course) {
		return courses.get(course);
	}
	
	public void setCourses(ArrayList<Student> courses) {
		this.courses = courses;
	}
	

}
