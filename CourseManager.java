package week2Homework;

public class CourseManager {
	public void joinTheProgram(Course course) {
		System.out.println(course.name+" dahil olundu.");
	}
	
	public void terminateTheProgram(Course course) {
		System.out.println(course.name +" programý sonlandýrýldý.");
	}
	
	public void showTheCourse(Course course) {
		System.out.println("Bulunduðunuz kursun adý:"+course.name+"\n"+"Bulunduðunuz kursun açýklamasý:"+course.description);
	}
	
	
	
}
