package CourseManagement;

import java.util.ArrayList;

public class mathCourse extends Course {
	private int level;
	private String textbook;
	private ArrayList<Student> students = new ArrayList<Student>(); // students in this course
	private Instructor instructor;
	
	public mathCourse(int courseID, String courseName, ArrayList<Course> req, int level, String textbook, int maxEnrollment, double requiredGPA, Instructor instructor) {
		super(courseID, courseName, req, maxEnrollment, requiredGPA);
		this.level = level;
		this.textbook = textbook;
		this.instructor = instructor;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getTextbook() {
		return textbook;
	}

	public void setTextbook(String textbook) {
		this.textbook = textbook;
	}
	 
	public void addStudent(Student student) {
		if(student.reqCheck(this)) { // returns true if pre reqs are met 
			students.add(student);
			System.out.println("Student has been added to the course");
		}
		else {
			System.out.println("Student is missing the required prerequisites to enter this course");
		}
	}
	
	public void removeStudent(Student student) { 
		if(students.contains(student)) {
			students.remove(student);
			System.out.println("Student has been removed from the course");
		}
		else {
			System.out.println("Student is not enrolled in this course");
		}
	}

	public Instructor getInstructor() {
		return instructor;
	}
	
	public void printInstructor() {
		System.out.println("\nAssigned instructor: \n" + getInstructor().getName());
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
