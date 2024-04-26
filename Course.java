package CourseManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
	private int courseID;
	private String courseName;
	private int[] req = new int[20]; // contains courseIDs
	private ArrayList<Instructor> instructors = new ArrayList<Instructor>(); // instructors in the course
	private ArrayList<Student> students = new ArrayList<Student>(); // students in the course
	static Scanner input = new Scanner(System.in);
	
	public Course(int courseID, String courseName, int[] req) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.req = req;
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


	public int[] getReq() {
		return req;
	}
	
	public void addStudent(Student student) {
		System.out.println("Enter selected course ID");
		int CourseID = input.nextInt();
		students.add(CourseID, student);
	}
	
	public void removeStudent(Student student) {
		System.out.println("Enter selected course ID");
		int CourseID = input.nextInt();
		students.remove(student);
	}

	public void setReq(int[] req) {
		this.req = req;
	}
}
