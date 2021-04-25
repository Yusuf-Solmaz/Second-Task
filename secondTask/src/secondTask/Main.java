package secondTask;

public class Main {

	public static void main(String[] args) {
	
		CourseRegister user1 = new CourseRegister();
		
		user1.user_name="Hakan";
		user1.category="Programming";
		user1.course="Java";
		user1.course_id=2;
		user1.course_time="2 Months";
		user1.instructor="Engin Demiroğ";
		
		CourseRegister user2 = new CourseRegister("Ahmet","Engin Demiroğ","C#",1,"2 Months","Programming");
		
		CourseRegister user3 = new CourseRegister("Nazlı","Engin Demiroğ","Java",2,"2 Months","Programming");
		
		CourseRegister [] userArray = {user1,user2,user3};
		
		for(CourseRegister info : userArray) {
			System.out.println(info.user_name+"\t"+info.course);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.registration(user1);
		courseManager.showCourseTime(user1);
		
		courseManager.registration(user2);
		courseManager.showCourseTime(user2);
		
		courseManager.registration(user3);
		courseManager.showCourseTime(user3);
		
		
		
	}

}
