package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mugesh_Testpage {

	private WebDriver driver;
	
	@BeforeTest
	public void test1() {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\acer\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file://C:/Users/acer/Desktop/firstHTML.html");
		
	}
	
	@Test (priority=1)
	public void Test1() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test
	public void Test2() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test(groups = {"TestNg demo"})
	public void Test3() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test(groups = {"TestNg demo"})
	public void Test4() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
		//Assert.assertEquals(true, expected);
	}
	
	@Test(groups = {"TestNg demo"})
	public void Test5() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test
	public void Test6() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test
	public void Test7() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test
	public void Test8() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test (priority=2)
	public void Test9() {				
		Mugesh_HomepageTest hp2 = new Mugesh_HomepageTest(driver);
		hp2.HomepageTestcase();
	}
	
	@Test
	public void Test10() {
		Mugesh_page2test mp = new Mugesh_page2test(driver);
		System.out.println("Entering Test 10");
		Assert.assertEquals(mp.page2testcase(), "10");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Testing Completed");
	}
	@BeforeMethod
	public void start() {
		System.out.println("Testing Started");
	}
	@AfterMethod
	public void end() {
		System.out.println("Test End");
	}
	
}
