package javaWeek3Homework;

public class UserManager {
	
	public void add(User user) {
		String fullName = user.getFirstName() + " " + user.getLastName();
		System.out.println(fullName + " kullanıcısı oluşturuldu.");
	}
	
	public void delete(User user) {
		System.out.println("Kulanıcı silindi. " + user.getEmail());
	} 

}
