package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver);
		String url = "C:/Users/Ganesh/Desktop/firstpage.html";
		String ufname = "testuser";
		String ulname = "demo123";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("F_name")).sendKeys(ufname);
		driver.findElement(By.id("L_name")).sendKeys(ulname);
		driver.findElement(By.id("male")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("2");
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByValue("2");
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("2");
		for(int i=1;i<=3;i++){
			if(i==1){
			for(int j=1;j<=3;j++){
				String tr1 = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/th["+j+"]")).getText();
				System.out.print(tr1 + "\t");
				}System.out.println();
			}
				else{
					for(int j=1;j<=3;j++){
						String tr2 = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
						System.out.print(tr2 + "\t");
					}System.out.println();
					}
			}
}
}
