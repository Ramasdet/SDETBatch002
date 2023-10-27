package testNGoHRM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PreconditionsandPostconditions {
	@Test
	public void testmethod1() {
		System.out.println("This is testmethod1");
	}
	
	@Test
	public void testmethod2() {
		System.out.println("This is testmethod2");
	}
	@BeforeSuite
	public void beforesuitemethod() {
	System.out.println("This is @Beforesuite method");	
	}
	
	@BeforeTest
	public void beforetestmethod() {
		System.out.println("This is @BeforeTest annotation method");
	}
	
	@BeforeClass
	public void beforeclassmethod() {
		System.out.println("This is @BeforeClass annotation method");
	}
	
	@BeforeGroups
	public void beforegroupsmethod() {
		System.out.println("This is @BeforeGroups annotation method");
	}
	
	@BeforeMethod
	public void beforemethodmethod() {
		System.out.println("This is @BeforeMethod annotation method");
	}
	@AfterMethod
	public void aftermethodmethod() {
		System.out.println("This is @AfterMethod annotation method");
	}
	@AfterGroups
	public void aftergroupmethod() {
		System.out.println("This is @AfterGroup annotation method");
	}
	@AfterClass
	public void afterclassmethod() {
		System.out.println("This is @AfterClass annotation method");
	}
	
	@AfterTest
	public void aftertestmethod() {
		System.out.println("This is @AfterTest annotation method");
	}
	@AfterSuite
	public void aftersuitemethod() {
		System.out.println("This is @AfterSute annotation method");
			
	}
	
}
	
	
	
	
	
	
	
	
	
	

