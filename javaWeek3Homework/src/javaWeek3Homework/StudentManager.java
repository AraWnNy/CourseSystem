package javaWeek3Homework;

public class StudentManager extends UserManager{
	public void enrollOnACourse(Student student, Course course) {
		student.setContinuingCourse(course);
		System.out.println("Kayıt başarılı.");
	}
}
