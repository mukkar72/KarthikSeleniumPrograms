package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {
	WebDriver driver;
	@Test
	public void a_pageload() {
		
	System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void b_clickflight() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget '] ")).click();
	}

}
