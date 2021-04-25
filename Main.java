package week2Homework;

public class Main {
	public static void main(String[] args) {
		System.out.println("Kodlama.io'ya hoþgeldiniz.");
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C#+Angular)","2 ay sürecek kampýmýzýn duyurularýný,takip ve dökümanlarýný buradan yapacaðýz.");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (Java+React)","2 ay sürecek kampýmýzýn duyurularýný,takip ve dökümanlarýný buradan yapacaðýz.");
		Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kursu","PYTHON,JAVA,C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin");
		
		Instructor instructor1 = new Instructor();
		instructor1.id =1;
		instructor1.name ="Engin Demiroð";
		instructor1.autobiography ="Yazýlým geliþtirmeye lisede \"yazýlým\" bölümünde okurken baþladým.\r\n"
				+ "\r\n"
				+ "Üniversite hayatýma ÖSS 2003 Türkiye derecesiyle baþladým. Sýrasýyla Baþkent ve ODTÜ'de Yönetim Biliþim Sistemleri (Lisans-Burslu) ve Týp Biliþimi(Yüksek Lisans) okudum. Profesyonel iþ hayatýma ise henüz üniversite birinci sýnýftayken baþladým.Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahibim.";
		
		Course[] courses = {course1,course2,course3};
		Instructor[] instructors = {instructor1};
		System.out.println("Aþaðýda sistemimizdeki bütün kurslar listelenmiþtir.");
		for(Course course:courses) {
			System.out.println("Kursun adý:"+course.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.showTheCourse(course2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.showInstructor(instructor1);;
		
		
	}

}
