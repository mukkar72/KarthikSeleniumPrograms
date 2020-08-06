package FlipkartAddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.utest.com/articles/best-websites-to-practice-test-automation-using-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("firstName")).sendKeys("Karthik");
		driver.findElement(By.id("lastName")).sendKeys("Raja");
		driver.findElement(By.id("email")).sendKeys("july7karthik@yopmail.com");
		
		
		

	}

}
