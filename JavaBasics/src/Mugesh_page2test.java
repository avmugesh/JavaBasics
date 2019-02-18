package PageTest;

import org.openqa.selenium.WebDriver;

import PageFactory.Mugesh_page2;

public class Mugesh_page2test {

	private WebDriver driver = null;
	
	public Mugesh_page2test(WebDriver driver) {
		this.driver = driver;
			}
	
	public String page2testcase () {
		System.out.println("Entering into Page test class");
		Mugesh_page2 hp2 = new Mugesh_page2(driver);
		String s2 = hp2.getdata();
		return s2;
	}
	
}
