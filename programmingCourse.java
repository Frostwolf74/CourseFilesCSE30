package CourseManagement;

import java.util.ArrayList;

public class programmingCourse extends Course {
	private int level;
	private String language;
	private ArrayList<Student> students = new ArrayList<Student>(); // students in this course
	private Instructor instructor; // only one instructor per course
	
	public programmingCourse(int courseID, String courseName, ArrayList<Course> req, String language, int maxEnrollment, double requiredGPA, Instructor instructor) {
		super(courseID, courseName, req, maxEnrollment, requiredGPA);
		this.language = language;
		this.level = level;
		this.instructor = instructor;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) { // use an entire student object and reference the variables from the object
		if(student.reqCheck(this)) { // returns true if pre reqs are met 
			students.add(student);
			System.out.printf("\u001b[32m" + "\n%s has been added to the course" + "\u001B[0m", student.getName());
			student.addCourse(this);
		}
		else {
			System.out.printf("\u001B[31m" + "\n%s is missing the required prerequisites to enter this course" + "\u001B[0m", student.getName());
		}
	}
	
	public void removeStudent(Student student) { 
		if(students.contains(student)) {
			students.remove(student);
			System.out.printf("\n%s has been removed from the course", student.getName());
		}
		else {
			System.out.printf("\u001b[33m" + "\n%s is not enrolled in this course" + "\u001b[0m", student.getName());
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
