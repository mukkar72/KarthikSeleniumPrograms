package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractise2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//p[@class='lost_password form-group']//a")).click();
		driver.findElement(By.id("email")).sendKeys("may26th2019@yopmail.com");
		driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']")).click();

	}

}
