package CourseManagement;

import java.util.ArrayList;

public class Course {
	private int courseID;
	private String courseName;
	private int[] req; // contains courseIDs
	
	public Course(int courseID, String courseName, int[] req) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.req = req;
	}
	
	public static void main(String[] args) {
		ArrayList<Course> instructor = new ArrayList<Course>();
		ArrayList<Course> student = new ArrayList<Course>();
				
	}
}
