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

	public void setID(int iD) {
		ID = iD;
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
	
	// reminder: DO NOT SEND INDIVIDUAL OBJECT VARIABLES WITHOUT REFERENCING AN OBJECT FIRST
	
	public boolean reqCheck(Course chosenCourse) { // prereq check for the student -> course
		int k=0;
		for(int i = 0; i < courses.size(); ++i) {
			for(int j = 0; j < chosenCourse.getReq().size(); ++j) {
				if(courses.get(i) == chosenCourse.getReq().get(j)) {
					++k;
				}
			}
		}
		
		if(k >= chosenCourse.getReq().size()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addCourse(Course course) {
		if(course.reqCheckCourse(getCourses())) {
			System.out.println("Course has been added to the student");
		}
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}
}
