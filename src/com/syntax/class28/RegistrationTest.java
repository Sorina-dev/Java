package com.syntax.class28;

public class RegistrationTest {
	public static void main(String[] args) {
		
		Registration s = new Registration();
		s.setEmail("ed@yahoo.com");
		s.setUsername("pioneers");
		s.setPassword("tuesday");
		System.out.println(s.getEmail());
		System.out.println(s.getUsername());
		System.out.println(s.getPassword());
	}

}
class Registration {
	/*
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * 
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, username and
	 * password.
	 * 
	 * Requirements: Valid email consider to be only yahoo Valid userName and
	 * password cannot be empty and should be of length larger than 6 characters.
	 * Also valid password cannot contain userName.
	 */
	
	private String email, username, password;

	// setters
	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email = email;
		}
	}

	// getters
	public String getEmail() {
		return email;
	}

	// setters
	public void setUsername(String username) {
		if (!username.isEmpty() && username.length() > 6) {
			this.username = username;
		}
		
	}

	// getter
	public String getUsername() {
		return username;
	}

	// setter
	public void setPassword(String password) {
		if (!password.isEmpty() && password.length() > 6 && !password.contains(username)) {
			this.password = password;
		}
	}

	// getter
	public String getPassword() {
		return password;
	}
}