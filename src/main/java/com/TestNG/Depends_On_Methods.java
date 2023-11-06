package com.TestNG;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	
	@Test
	public void school() {
	System.out.println("School");
	}

	@Test(dependsOnMethods="student")
     public void college() {
     System.out.println("College");
}	

}


//If we mention @Test(dependsOnMethods="school"), one method is dependent on another one. So if we ignore the dependent method error will be throwed.
