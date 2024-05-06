package CourseManagement;

import java.util.ArrayList;
import java.util.List;
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
		this.maxEnrollment = maxEnrollment;
		this.requiredGPA = requiredGPA;
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
}
