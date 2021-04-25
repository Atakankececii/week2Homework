package week2Homework;

public class Main {
	public static void main(String[] args) {
		System.out.println("Kodlama.io'ya ho�geldiniz.");
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C#+Angular)","2 ay s�recek kamp�m�z�n duyurular�n�,takip ve d�k�manlar�n� buradan yapaca��z.");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java+React)","2 ay s�recek kamp�m�z�n duyurular�n�,takip ve d�k�manlar�n� buradan yapaca��z.");
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kursu","PYTHON,JAVA,C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin");
		
		Instructor instructor1 = new Instructor();
		instructor1.id =1;
		instructor1.name ="Engin Demiro�";
		instructor1.autobiography ="Yaz�l�m geli�tirmeye lisede \"yaz�l�m\" b�l�m�nde okurken ba�lad�m.\r\n"
				+ "\r\n"
				+ "�niversite hayat�ma �SS 2003 T�rkiye derecesiyle ba�lad�m. S�ras�yla Ba�kent ve ODT�'de Y�netim Bili�im Sistemleri (Lisans-Burslu) ve T�p Bili�imi(Y�ksek Lisans) okudum. Profesyonel i� hayat�ma ise hen�z �niversite birinci s�n�ftayken ba�lad�m.Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalar�na sahibim.";
		
		Course[] courses = {course1,course2,course3};
		Instructor[] instructors = {instructor1};
		System.out.println("A�a��da sistemimizdeki b�t�n kurslar listelenmi�tir.");
		for(Course course:courses) {
			System.out.println("Kursun ad�:"+course.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.showTheCourse(course2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.showInstructor(instructor1);;
		
		
	}

}
