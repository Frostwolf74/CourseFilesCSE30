package CourseManagement;

public class mathCourse extends Course {
	private int level;
	private String textbook;
	
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
	
}
