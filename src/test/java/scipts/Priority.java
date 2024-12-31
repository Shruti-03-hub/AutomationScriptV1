package scipts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Priority {
  @Test(priority=2)
  public void test1() {
	  System.out.println("test 1block");
  }
  @Test(priority=2)
  public void test2() {
	  System.out.println("test 2 block");
  }
  @Test(priority=-2)
  public void test3() {
	  System.out.println("test 3block");
  }
  @Test(priority=1)
  public void test4() {
	  System.out.println("test 4 block");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
			System.out.println("BeFore Method block");
		}
	 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method block");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeFore Class block");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class block");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeFore test block");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test block");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeFore suite block");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite block");
  }

}
