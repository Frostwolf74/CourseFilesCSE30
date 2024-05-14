package CourseManagement;

import java.util.ArrayList;

public class Instructor {
	private String name, email, hours;
	private ArrayList<Course> courses = new ArrayList<Course>(); // courses the instructor has
	
	public Instructor(String name, String email, String hours) {
		this.name = name;
		this.email = email;
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void addCourse(Course course) { // instructors dont need a req check for now
		courses.add(course);
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}
}
