package PageTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageFactory.Home_Page;
import PageFactory.Mugesh_Homepagefactory;

public class Mugesh_HomepageTest {

	private WebDriver driver = null;
	
	public Mugesh_HomepageTest(WebDriver driver) {
		this.driver = driver;
	}
	
	public void HomepageTestcase() {
		Mugesh_Homepagefactory hp1 = new Mugesh_Homepagefactory(driver);
		hp1.firstname("Mugesh");
		hp1.lastname("Anbalagan");
		String t1 = hp1.title();
		Assert.assertEquals(t1, "First HTML Page");
	}
}

