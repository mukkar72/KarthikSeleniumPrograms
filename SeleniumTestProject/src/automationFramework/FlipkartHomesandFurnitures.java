package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHomesandFurnitures {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Forgot?'])/preceding::button[1]")).click();
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		Actions mouseover = new Actions(driver);
		Thread.sleep(2000);
		mouseover.moveToElement(home).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Coffee Tables')]")).click();
		
		
		
		

	}

}
