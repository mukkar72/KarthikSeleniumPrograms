package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();
		driver.findElement(By.name("userName")).sendKeys("Karthikeyan");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		

	}

}
