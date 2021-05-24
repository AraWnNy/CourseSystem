package javaWeek3Homework;

public class Student extends User{
	private Course continuingCourse;

	public Course getContinuingCourse() {
		return continuingCourse;
	}

	public void setContinuingCourse(Course continuingCourse) {
		this.continuingCourse = continuingCourse;
	}
}
