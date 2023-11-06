package com.TestNG;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled = false)
	public void student() {
	System.out.println("Student");
	}
	@Test(enabled = false)
	public void employee() {
    System.out.println("Employee");
}
	@Test
     public void add() {
     System.out.println("Add");
}	

}


//IF we mention @Test(enabled = false), it will ignore that particular method.