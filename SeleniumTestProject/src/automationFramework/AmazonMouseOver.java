package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
		WebElement Laptop = driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(Laptop).build().perform();
		driver.findElement(By.xpath("//a[text()='iBall']")).click();
		String matches = driver.findElement(By.id("s-result-count")).getText();
		System.out.println("Matching Results  :"+matches);
		
		

	}

}
