package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BreakPoint {
	WebDriver driver;

	@Test
	public void a_pageload() {

		System.setProperty("webdriver.chrome.driver",
				"D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/online-banking.html");
		driver.manage().window().maximize();
}

	@Test
	public void b_login() {
		driver.findElement(By.xpath("//button[@id='signin_button']")).click();
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
}
