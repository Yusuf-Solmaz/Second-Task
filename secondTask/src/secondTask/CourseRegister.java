package secondTask;


public class CourseRegister {
	
	 public CourseRegister () {
		 System.out.println("No-arg constructor is called ");
	 }
	
	 public CourseRegister(String user_name,String insturctor,String course,int course_id,String course_time ,String category ) {
		 
		 this.instructor=instructor;
		 this.course=course;
		 this.course_id=course_id;
		 this.course_time=course_time;
		 this.category=category;
		 this.user_name=user_name;
		 System.out.println("Parameterized Constructor is called");
		 
	 }
	
	
	
	String user_name;
	 String instructor;
	 String course;
	 
	 int course_id;
	 String category;
	 String course_time;

}
