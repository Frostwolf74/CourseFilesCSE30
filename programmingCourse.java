package CourseManagement;

import java.util.ArrayList;

public class programmingCourse extends Course {
	private int level;
	private String language;
	private ArrayList<Student> students = new ArrayList<Student>(); // students in this course
	
	public programmingCourse(int courseID, String courseName, int[] req, String language) {
		super(courseID, courseName, req);
		this.language = language;
		this.level = level;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
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
	}
}
