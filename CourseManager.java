package week2Homework;

public class CourseManager {
	public void joinTheProgram(Course course) {
		System.out.println(course.name+" dahil olundu.");
	}
	
	public void terminateTheProgram(Course course) {
		System.out.println(course.name +" programı sonlandırıldı.");
	}
	
	public void showTheCourse(Course course) {
		System.out.println("Bulunduğunuz kursun adı:"+course.name+"\n"+"Bulunduğunuz kursun açıklaması:"+course.description);
	}
	
	
	
}
