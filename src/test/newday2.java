package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newday2 {

	@Test
	public  void menu() {
		// TODO Auto-generated method stub
		
		System.out.println("great DAY");
		System.out.println("great DAY1");
		System.out.println("great DAY2");

	}
	
	
	@BeforeTest
	 public void prerequisit()
	 {
		System.out.println("i am the PRIORITY");
	 }
	
	
	@AfterTest
	public void leastPriority1()

	{
			System.out.println("i will go at the LAST lest see");
	}

}
