package javaWeek3Homework;

public class UserManager {
	
	public void add(User user) {
		String fullName = user.getFirstName() + " " + user.getLastName();
		System.out.println(fullName + " kullan�c�s� olu�turuldu.");
	}
	
	public void delete(User user) {
		System.out.println("Kulan�c� silindi. " + user.getEmail());
	} 

}
