package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(3000);
		WebElement men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(men).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Casual Shirts')]")).click();
		
		

	}

}
