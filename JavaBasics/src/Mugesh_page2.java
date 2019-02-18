package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mugesh_page2 {

	private WebDriver driver = null;
	private static final String data = "/html/body/div/table/tbody/tr[5]/td[3]";
	
	@FindBy(xpath = data)
	WebElement Data;
	
	public Mugesh_page2(WebDriver driver) {
		this.driver = driver;
		System.out.println("Constructor created");
	}
	
	public String getdata() {
		System.out.println("GetDtaa method executed");
		System.out.println(driver);
		System.out.println(Data);
		System.out.println(Data.getText() + "Cell data");
		return Data.getText();	
	}
}
