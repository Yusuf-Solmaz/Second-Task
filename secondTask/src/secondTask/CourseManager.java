package secondTask;

public class CourseManager {
	
	public void registration (CourseRegister courseRegister) {
		System.out.println("Registration confirmed for "+courseRegister.user_name);
	}
	
	public void showCourseTime(CourseRegister courseRegister) {
		
		System.out.println("Course time is "+courseRegister.course_time+" for "+courseRegister.course);
	}
}
