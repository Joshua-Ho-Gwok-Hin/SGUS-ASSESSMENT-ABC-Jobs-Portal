package com.aaa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.LogManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.aaa.model.Login;
import com.aaa.model.UserProfile;

class JunitTest {
	@Autowired
	 LoginService testing; 
	
	@Test
	void testEmail() {
		try {
			SuccessEmail.sendSuccessMail("joshuaportallithan@gmail.com");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testTwo() {
	    UserProfile u = new UserProfile();
	    u.setFirstName("John");
	    assertNotNull(u.getFirstName(), "Not Null");
	}
	
	@Test
	public void register() {
		UserProfile t1 = new UserProfile();		
		t1.setBirthday("1987-12-31");
		t1.setCity("Lion");
		t1.setCountry("Singapore");
		t1.setEmail("superman@hero.com");
		t1.setFirstName("Superman");
		t1.setLastName("Hero");
		t1.setGender("M");
		t1.setUsername("Superman");
		t1.setPassword("Hero");
		assertNotNull(t1);
		}
}

//@Test
//public void testLoginServiceWorkingOrNot() {
//	testing.findByUsername("Peter");
//	assertNotNull("Peter");
//}