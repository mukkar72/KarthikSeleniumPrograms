package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		//browser opening
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/client/#/dashboard");
		driver.manage().window().maximize();
		//Login
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		//click Admin
		driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();
		//click usermanagement
		driver.findElement(By.xpath("//span[contains(text(),'User Management')]")).click();
		//click users
		driver.findElement(By.xpath("(//span[contains(text(),'Users')])[1]")).click();
		Thread.sleep(5000);
		//Click Add User
		driver.findElement(By.xpath("//i[contains(text(),'add')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("selectedEmployee_value")).sendKeys("Karthikeyan");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"july22karthik@yopmail.com").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		
		

	}

}
