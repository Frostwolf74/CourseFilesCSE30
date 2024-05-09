package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name, major;
	private int ID;
	private double GPA;
	private ArrayList<Course> courses = new ArrayList<Course>(); // courses the student has
	static Scanner input = new Scanner(System.in);
	
	public Student(ArrayList<Course> student1PreReqs, String name, String major, int ID, double GPA) {
		this.name = name;
		this.major = major;
		this.ID = ID;
		this.courses = student1PreReqs;
		this.GPA = GPA;
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
	
	public double getGPA() {
		return GPA;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public boolean reqCheck(Course chosenCourse) { // prereq check for the student -> course
		int k=0;
		for(int i = 0; i < courses.size(); ++i) {
			for(int j = 0; j < chosenCourse.getReq().size(); ++j) {
				if(courses.get(i) == chosenCourse.getReq().get(j)) { // counts the amount of times a student course matches a course prerequisite
					++k;
				}
			}
		}
		
		if(k >= chosenCourse.getReq().size()) { // checks if the student has all of the prerequisites
			if(getGPA() >= chosenCourse.getRequiredGPA()) { // checks if the student has high enough GPA
				return true;
			}
		}
		return false;

	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}
}
