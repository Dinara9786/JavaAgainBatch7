package com.review.class29;

public class Registration {

	private String email;
	private String userName;
	private String password;
	static String validEmail = "yahoo";

	public void setEmail(String email) {
		if (email.contains(validEmail)) {
			this.email = email;
			System.out.println("Your email is correct = " + email);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Password should not contain username");
				}
			} else {
				System.out.println("Password should be larger than 6 characters");
			}
		} else {
			System.out.println("Password cannot be empty");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
			System.out.println("Username is correct =" + userName);
		}

	}

}
