package com.TestNG;

import org.apache.commons.math3.analysis.function.Add;
import org.testng.annotations.Test;

public class Priority {
	
	
	@Test
	public void student() {
	System.out.println("Student");
	}
	@Test(priority=0)
	public void employee() {
    System.out.println("Employee");
}
	@Test(priority=3)
     public void add() {
     System.out.println("Add");
}	

}
//@Test executes the output as per the ASCII value
//if priority=2 is given for two methods, Based on ASCII value output will be executed
//if we didnt mention priority value for one method and another two methods has mentioned the values the @Test will defaulty assign as 0 and will execute as per the order
