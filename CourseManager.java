package week2Homework;

public class CourseManager {
	public void joinTheProgram(Course course) {
		System.out.println(course.name+" dahil olundu.");
	}
	
	public void terminateTheProgram(Course course) {
		System.out.println(course.name +" program� sonland�r�ld�.");
	}
	
	public void showTheCourse(Course course) {
		System.out.println("Bulundu�unuz kursun ad�:"+course.name+"\n"+"Bulundu�unuz kursun a��klamas�:"+course.description);
	}
	
	
	
}
