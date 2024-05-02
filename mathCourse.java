package CourseManagement;

import java.util.ArrayList;

public class mathCourse extends Course {
	private int level;
	private String textbook;
	static ArrayList<Student> students = new ArrayList<Student>(); // students in this course
	
	public mathCourse(int courseID, String courseName, int[] req, int level, String textbook, int maxEnrollment, double requiredGPA) {
		super(courseID, courseName, req, maxEnrollment, requiredGPA);
		this.level = level;
		this.textbook = textbook;
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
		if(student.reqCheck(student, Main.getSelectedCourse())) { // returns true if pre reqs are met 
			students.add(student);
			System.out.println("Student has been added to the course");
		}
		else {
			System.out.println("Student is missing the required prerequisites to enter this course");
		}
	}
	
	public void removeStudent(Student student) { 
		students.remove(student);
		System.out.println("Student has been removed from the course");
	}	
}
