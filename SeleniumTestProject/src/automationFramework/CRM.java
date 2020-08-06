package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")).click();
		driver.findElement(By.name("email")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9840372968");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("recaptcha-anchor")).click();
		WebElement captcha = driver.findElement(By.id("recaptcha-anchor"));
		captcha.click();
	}

}
