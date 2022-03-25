package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class newday1 {

	 
		// TODO Auto-generated method stub
	
	
@Test(groups=("smoke"))
		 public void  Demo()
		 {
			 
			 System.out.println("Hello");
			 
		 }

@BeforeSuite
public void prerequisit()
{
	System.out.println("i am the MOST Important thing");
}

//DataProvider Annotation-To initiate the Concept of Parameterization 
@Test(dataProvider="getData")

public void Demo1(String Username,String Password)
{
	System.out.println("Bye");
	System.out.println(Username);
	System.out.println(Password);
}

//DataProvider Annotation-To initiate the Concept of Parameterization 
@DataProvider
public Object[][] getData()
{ 
	Object[][] data= new Object[3][2];
			
			data[0][0]="FirstUserdata";
            data[0][1]="FirstPassword";	
            
            data[1][0]="SecondUserdata";
            data[1][1]="SecondPassword";	
            
            data[2][0]="ThirdUserdata";
            data[2][1]="ThirdPassword";	
            
            
            return data;
}

	

}
