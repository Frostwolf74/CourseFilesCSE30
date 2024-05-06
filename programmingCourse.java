package CourseManagement;

import java.util.ArrayList;

public class programmingCourse extends Course {
	private int level;
	private String language;
	private ArrayList<Student> students = new ArrayList<Student>(); // students in this course
	
	public programmingCourse(int courseID, String courseName, ArrayList<Course> req, String language, int maxEnrollment, double requiredGPA) {
		super(courseID, courseName, req, maxEnrollment, requiredGPA);
		this.language = language;
		this.level = level;
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

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) { // use an entire student object and reference the variables from the object
		if(student.reqCheck(this)) { // returns true if pre reqs are met 
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
