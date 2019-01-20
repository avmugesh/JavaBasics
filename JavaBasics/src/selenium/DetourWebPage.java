package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DetourWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver);
		String url = "http://www.newtours.demoaut.com";
		String uname = "demo123";
		String passwd = "demo123";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys(uname);;
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(passwd);
		driver.findElement(By.xpath("//input[@name = 'login']")).click();
		WebElement passengers = driver.findElement(By.name("passCount"));
		Select s1 = new Select(passengers);
		s1.selectByValue("2");
		WebElement departfrom = driver.findElement(By.name("fromPort"));
		Select s2 = new Select(departfrom);
		s2.selectByValue("Frankfurt");
		WebElement on = driver.findElement(By.name("fromMonth"));
		Select s3 = new Select(on);
		s3.selectByValue("1");
		WebElement day = driver.findElement(By.name("fromDay"));
		Select s4 = new Select(day);
		s4.selectByValue("20");
		WebElement arrivingin = driver.findElement(By.name("toPort"));
		Select s5 = new Select(arrivingin);
		s5.selectByValue("Acapulco");
		WebElement returning = driver.findElement(By.name("toMonth"));
		Select s6 = new Select(returning);
		s6.selectByValue("1");
		WebElement day1 = driver.findElement(By.name("toDay"));
		Select s7 = new Select(day1);
		s7.selectByValue("20");
		driver.findElement(By.name("findFlights")).click();
	}

}
