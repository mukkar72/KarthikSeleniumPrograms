package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/StMarco89/automationpractice.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.id("user_login")).sendKeys("mukkar1972");
		driver.findElement(By.id("user_email")).sendKeys("mukkar10@outlook.com");
		driver.findElement(By.id("user_password")).sendKeys("Mukunth@1972");
		driver.findElement(By.id("signup_button")).click();

	}

}
