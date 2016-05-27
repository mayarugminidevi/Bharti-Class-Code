package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {
	@BeforeTest
	public void beforeTest(){
		System.out.println("before Test");
		//throw new SkipException("Skipping this exception");
	}
    @Test
    
    public void yahooNews(){
    	System.out.println("news Test");
    	
    	//Assert.assertEquals("Good", "good");
    	Assert.assertTrue(6<1, "Error Message");
    }
    
    @AfterTest
    public void afterTest(){
    	System.out.println("afterTest");
    }
}
