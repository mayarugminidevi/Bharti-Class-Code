package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class YahooTest {
  @Test
  public void testRecieveMail() {
	  System.out.println("Testing recieving email");
  }
  
  @Test
  public void testSendMail(){
	  System.out.println("Testing sending Mail");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("In before method");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("In before test");
  }
 @AfterTest
 public void afterTest(){
	 System.out.println("After Test");
 }
 
 @AfterMethod
 public void afterMethod(){
	 System.out.println("After Method");
 }
 
 @BeforeSuite
 public void beforeSuite(){
	 System.out.println("Before suite");
 }
 
 @AfterSuite
 public void afterSuite(){
	 System.out.println("After suite");
 }
}
