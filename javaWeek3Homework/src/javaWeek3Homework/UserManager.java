package javaWeek3Homework;

public class UserManager {
	
	public void add(User user) {
		String fullName = user.getFirstName() + " " + user.getLastName();
		System.out.println(fullName + " kullanýcýsý oluþturuldu.");
	}
	
	public void delete(User user) {
		System.out.println("Kulanýcý silindi. " + user.getEmail());
	} 

}
