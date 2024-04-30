package CourseManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
	private int courseID;
	private String courseName;
	private int[] req = new int[20]; // contains courseIDs
	//private ArrayList<Instructor> instructors = new ArrayList<Instructor>(); // instructors in the course
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

	public void setReq(int[] req) {
		this.req = req;
	}
	
	public static void addStudent(Student student) {  
		System.out.println("Select a course: \n1. Computer Science 1\n2. Computer Science 2\n3. Math 1\n4. Math 2");
		int selectionCourse = input.nextInt();
		
		switch(selectionCourse) {
		case 1:
			programmingCourse.addStudent(student);
			break;
		case 2:
			programmingCourse.addStudent(student);
			break;
		case 3:
			mathCourse.addStudent(student);
			break;
		case 4:
			mathCourse.addStudent(student);
		}
	}
	
	public static void removeStudent(Student student) { 
		System.out.println("Select a course: \n1. Computer Science 1\n2. Computer Science 2\n3. Math 1\n4. Math 2");
		int selectionCourse = input.nextInt();
		
		switch(selectionCourse) {
		case 1:
			programmingCourse.removeStudent(student);
			break;
		case 2:
			programmingCourse.removeStudent(student);
			break;
		case 3:
			mathCourse.removeStudent(student);
			break;
		case 4:
			mathCourse.removeStudent(student);
		}
	}
}
