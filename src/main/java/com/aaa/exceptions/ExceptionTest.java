package com.aaa.exceptions;

import com.aaa.model.UserProfile;

public class ExceptionTest {
	static UserProfile dbUser = new UserProfile();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserProfile dbUser = new UserProfile();
		dbUser.setEmail("peter@email.com");
		
		UserProfile parker = new UserProfile();
		parker.setEmail("peter@email.com");
		System.out.println(dbUser);
		
		try {
			insert(parker);
			System.out.println("Inserted successfully!");
		} catch (DuplicateEmailException e) {
			System.out.println(e.getMessage());
		}
	}
	private static void insert(UserProfile newUser) throws DuplicateEmailException {
		// TODO Auto-generated method stub
		if (dbUser.getEmail().equals(newUser.getEmail()))
		throw new DuplicateEmailException(newUser.getEmail());
	}

}
