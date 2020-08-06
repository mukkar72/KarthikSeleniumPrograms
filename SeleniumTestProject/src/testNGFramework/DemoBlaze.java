package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoBlaze {
	WebDriver driver;
	@Test (priority = 1)
	public void Demoblaze() {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}
	@Test (priority = 2)
	public void signup() throws InterruptedException {
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("sign-username")).sendKeys("Rajaram777");
		driver.findElement(By.id("sign-password")).sendKeys("Mukunth@05");
		WebElement signup = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
		signup.click();
		Thread.sleep(2000);
		Alert aler1 = driver.switchTo().alert();
		aler1.accept();
				
	}
	@Test (priority = 3)
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("loginusername")).sendKeys("Rajaram777");
		driver.findElement(By.id("loginpassword")).sendKeys("Mukunth@05");
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		login.click();
	}
	@Test (priority = 4)
	public void itemselect() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Nexus 6')]")).click();
	}
	@Test (priority = 5)
	public void addtocart() throws InterruptedException {
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//strong[contains(text(),'Product description')]/following::a[1]"));
		cart.click();
		Thread.sleep(2000);
		Alert aler2 = driver.switchTo().alert();
		aler2.accept();
		
				
		
		
	}
	

}
