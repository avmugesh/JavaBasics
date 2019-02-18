package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mugesh_Homepagefactory {

	private WebDriver driver = null;
	private static final String fname = "//input[@name='f_name']";
	private static final String lname = "//input[@name='l_name']";
	
	@FindBy(xpath = fname)
	WebElement first_name;
	
	@FindBy(xpath = lname)
	WebElement last_name;
	
	public Mugesh_Homepagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void firstname (String firstname){
		first_name.clear();
		first_name.sendKeys(firstname);
	}
	public void lastname (String lastname){
		last_name.clear();
		last_name.sendKeys(lastname);
		
	}
	public String title() {
		return driver.getTitle();
	}
}
