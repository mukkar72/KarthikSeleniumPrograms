package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("Washing Machine");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Add to Compare')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Add to Compare')])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'COMPARE')]")).click();
		Thread.sleep(5000);
		Select brand = new Select(driver.findElement(By.xpath("(//div[contains(text(),'Choose Brand')])[1]")));
		brand.selectByVisibleText("Hyundai");
		
		

	}

}
