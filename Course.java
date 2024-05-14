package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	private int courseID, maxEnrollment;
	private double requiredGPA;
	private String courseName;
	private Instructor instructor;
	private ArrayList<Course> req = new ArrayList<Course>(); // contains courseIDs
	static Scanner input = new Scanner(System.in);
	
	public Course(int courseID, String courseName, ArrayList<Course> req, int maxEnrollment, double requiredGPA, Instructor instructor) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.req = req;
		this.setMaxEnrollment(maxEnrollment);
		this.setRequiredGPA(requiredGPA);
		this.instructor = instructor;
	}
	
	public int getCourseID() {
		return courseID;
	}


	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Course> getReq() {
		return req;
	}

	public void setReq(ArrayList<Course> req) {
		this.req = req;
	}
	
	public int getMaxEnrollment() {
		return maxEnrollment;
	}

	public void setMaxEnrollment(int maxEnrollment) {
		this.maxEnrollment = maxEnrollment;
	}

	public double getRequiredGPA() {
		return requiredGPA;
	}

	public void setRequiredGPA(double requiredGPA) {
		this.requiredGPA = requiredGPA;
	}
	
	public void printAll(int i) { // cannot use toString because of arrayList printing using for loop 
		System.out.println(
				"Course Name: " + courseName +
				"\nCourse ID: " + courseID +
				"\nMaximum enrollment: " + maxEnrollment +
				"\nMinimum GPA: " + requiredGPA
		);
		if(req.size() != 0) {
			System.out.println("\nPrerequisites: ");
			for(int j = 0; j < i; ++j) {
				System.out.println(req.get(j).courseName);
			}
		}
		else {
			System.out.println("\nThere are no prerequisites for this course");
		}
	}
	
	public Instructor getInstructor() { 
		return instructor;
	}
	
	public void printInstructor() {
		System.out.println("\nAssigned instructor: \n" + instructor.getName());
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
