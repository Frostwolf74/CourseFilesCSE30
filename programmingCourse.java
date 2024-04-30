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
		//boolean check = reqCheck(student);
		
		if(check) {
			students.add(student);
		}
		else {
			System.out.println("This student is missing the required prerequisites to enter this course");
		}
	}
	
	public void removeStudent(Student student) { 
		students.remove(student);
	}
	
	public boolean reqCheck(Student student) {
		for(int i = 1; i < student.getAllCourses().size()+1; ++i) {
			if(student.getCourses(i) == 1) {
				
			}
		}
		
	}
}
