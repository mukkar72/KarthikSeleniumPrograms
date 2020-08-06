package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartCompare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Forgot?'])/preceding::button[1]")).click();
		driver.findElement(By.name("q")).sendKeys("Washing Machine");
		driver.findElement(By.xpath("//input[@name='q']/following::button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Add to Compare')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Add to Compare')])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'COMPARE')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		
		

	}

}
