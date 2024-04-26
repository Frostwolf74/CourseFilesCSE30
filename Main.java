package CourseManagement;

public class Main {
	public static void main(String[] args) {
		int[] student1PreReqs = {1,2,3,4}; 
		Student student1 = new Student("student1", "major", 1, student1PreReqs); // String name, String major, int ID, int[] completedCourses
		Instructor instructor1 = new Instructor("Instructor1", "Instructor1@domain.com", "9:00 to 17:00"); // String name, String email, String hours
	
		int[] CSE1PreReqs = {1,2};
		int[] CSE2PreReqs = {1,2,3};
		int[] math1PreReqs = {1};
		int[] math2PreReqs = {1,2};
		programmingCourse CSE1 = new programmingCourse(0, "CSE-1", CSE1PreReqs, "C++"); // int courseID, String courseName, int[] req, String language
		programmingCourse CSE2 = new programmingCourse(1, "CSE-2", CSE2PreReqs, "JavaScript"); 
		mathCourse math1 = new mathCourse(10, "Math-1", math1PreReqs, 1, "math1Textbook"); // ^, ^, ^, int level, String textbook
		mathCourse math2 = new mathCourse(11, "Math-2", math2PreReqs, 2, "math2Textbook");
		
		student1.regCourse(student1, CSE1);
//		instructor1.regCourse(instructor1, CSE1);
	}
}
