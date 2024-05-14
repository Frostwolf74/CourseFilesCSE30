package CourseManagement;

import java.util.ArrayList;

public class programmingCourse extends Course {
	private int level;
	private String language;
	private ArrayList<Student> students = new ArrayList<Student>(); // students in this course
	
	public programmingCourse(int courseID, String courseName, ArrayList<Course> req, String language, int maxEnrollment, double requiredGPA, Instructor instructor) {
		super(courseID, courseName, req, maxEnrollment, requiredGPA, instructor);
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

	public void addStudent(Student student) {		
		switch(student.reqCheck(this)) {
		case -1: // returns -1 if all checks passed
			students.add(student);
			System.out.printf("\u001b[32m" + "\n%s has been added to the course\n" + "\u001B[0m", student.getName());
			student.addCourse(this);
			break;
		case 1:
			System.out.printf("\u001B[31m" + "\n%s is missing the required prerequisites to enter this course" + "\u001B[0m", student.getName());
			break;
		case 2:
			System.out.printf("\u001B[31m" + "\n%s is missing the required GPA to enter this course" + "\u001B[0m", student.getName());
			break;
		case 3:
			System.out.printf("\u001B[31m" + "\nThis course is full" + "\u001B[0m");
			break;
		}
	}
	
	public void printStudents() {
		System.out.println("\nNumber of students enrolled: " + students.size());
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
}
