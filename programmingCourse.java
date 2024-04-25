package CourseManagement;

public class programmingCourse extends Course {
	private String language;
	
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
	
}
