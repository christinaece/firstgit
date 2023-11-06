package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test{
	
	@Test
	@Parameters({"user","pass"})
	public void login(String username,String password) {
		System.out.println(username+"   "+password);
		
	}
 }
