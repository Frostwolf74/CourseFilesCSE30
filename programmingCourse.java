package CourseManagement;

import java.util.ArrayList;

public class programmingCourse extends Course {
	private String language;
	static ArrayList<Student> students = new ArrayList<Student>(); // students in the course
	
	public programmingCourse(int courseID, String courseName, int[] req, String language) {
		super(courseID, courseName, req);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public static void addStudent(Student student) { // FIXME
		students.add(student);
	}
	
	public static void removeStudent(Student student) { // FIXME
		students.remove(student);
	}
	
//	public Override addStudent(Student student) {
//	
//}
}
