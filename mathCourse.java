package CourseManagement;

import java.util.ArrayList;

public class mathCourse extends Course {
	private int level;
	private String textbook;
	static ArrayList<Student> students = new ArrayList<Student>(); // students in the course
	
	public mathCourse(int courseID, String courseName, int[] req, int level, String textbook) {
		super(courseID, courseName, req);
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
	
	public static void addStudent(Student student) { // FIXME
		students.add(student);
	}
	
	public static void removeStudent(Student student) { // FIXME
		students.remove(student);
	}
	
//	public Override addStudent(Student student) {
//		
//	}
	
}
