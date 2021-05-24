package javaWeek3Homework;

public class Main {

	public static void main(String[] args) {
		Course course = new Course();
		course.setId(1);
		course.setCourseName("Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý");
		
		Student student = new Student();
		student.setId(111);
		student.setFirstName("Fikret");
		student.setLastName("Gözütok");
		student.setEmail("crazy_boy@mail.com");
		
		Instructor instructor = new Instructor();
		instructor.setId(1010);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin_demirog@mail.com");
		instructor.setAboutInstructor("Merhaba. Ben Engin Demiroð. MCT, PMP ve ITIL sertifikasyonlarýna sahibim");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.publishACourse(course);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.enrollOnACourse(student, course);
		
	}

}
