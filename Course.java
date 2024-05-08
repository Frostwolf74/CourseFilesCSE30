package CourseManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	private int courseID, maxEnrollment;
	private double requiredGPA;
	private String courseName;
	private ArrayList<Course> req = new ArrayList<Course>(); // contains courseIDs
	static Scanner input = new Scanner(System.in);
	
	public Course(int courseID, String courseName, ArrayList<Course> req, int maxEnrollment, double requiredGPA) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.req = req;
		this.setMaxEnrollment(maxEnrollment);
		this.setRequiredGPA(requiredGPA);
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
	
	public boolean reqCheckCourse(ArrayList<Course> course) { // prereq check for course -> student
		int k=0;
		for(int i = 0; i < req.size(); ++i) {
			for(int j = 0; j < course.size(); ++j) {
				if(req.get(i) == course.get(j)) {
					++k;
				}
			}
		}
		
		if(k >= course.size()) {
			return true;
		}
		else {
			return false;
		}
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
	
	public void printAll(int i) {
		System.out.println(
				"Course Name: " + getCourseName() +
				"\nCourse ID: " + getCourseID() +
				"\nMaximum enrollment: " + getMaxEnrollment() +
				"\nMinimum GPA: " + getRequiredGPA()
		);
		if(getReq().size() != 0) {
			System.out.println("\nPrerequisites: ");
			for(int j = 0; j < i; ++j) {
				System.out.println(getReq().get(j).getCourseName());
			}
		}
		else {
			System.out.println("\nThere are no prerequisites for this course");
		}
	}
}
