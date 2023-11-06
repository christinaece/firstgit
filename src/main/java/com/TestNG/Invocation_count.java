package com.TestNG;

import java.io.File;
import java.io.FileInputStream;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation_count {
	
	
	@Test(groups={"sub"})
	  public void sub1() {
		  System.out.println("Sub:" +(5-1));
	  }
	@Test(groups={"sub"})
	  public void sub2() {
		  System.out.println("Sub:" +(3-1));
	  }
	@Test(groups={"sub"})
	  public void sub3() {
		System.out.println("Sub:" +(4-1));
	}
	   @Test(expectedExceptions=  InterruptedException.class)
	  public void exception() {
		  try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	  }

}
// invocationCount is used to get an output as per the given input count.












