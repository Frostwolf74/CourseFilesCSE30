package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name, major;
	private int ID;
	private ArrayList<Course> courses = new ArrayList<Course>(); // courses the student has
	static Scanner input = new Scanner(System.in);
	
	public Student(ArrayList<Student> courses, String name, String major, int ID) {
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
	
	public ArrayList<Course> getAllCourses() {
		return courses;
	}
	
	public boolean reqCheck(Course[] course) {
		int k=0;
		for(int i = 0; i < courses.size(); ++i) {
			for(int j = 0; j < course.length; ++j) {
				if(courses.get(i) == course[j]) {
					++k;
				}
			}
		}
		
		if(k >= course.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	

}
