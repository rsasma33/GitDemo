package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newday3 {
	
	@AfterSuite
	 public void prerequisit()
	 {
		System.out.println("i am the LEAST Important thing");
		System.out.println("i am the LEAST Important thing1");
		System.out.println("i am the LEAST Important thing2");
	 }
	

	@Test(groups=("smoke"))
	public  void menu() {
		// TODO Auto-generated method stub
		
		System.out.println("Happy Day");

		System.out.println("Happy Day");
		System.out.println("Happy Day");
		System.out.println("Happy Day");
		System.out.println("Happy Day");
		System.out.println("Happy Day");
	}
	
	@AfterTest
	
public void leastPriority()

{
		System.out.println("i will go at the LAST");
		System.out.println("i will go at the LAST always");
}

}