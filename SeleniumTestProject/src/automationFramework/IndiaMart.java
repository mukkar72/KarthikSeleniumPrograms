package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiaMart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indiamart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-input")).sendKeys("mobile");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.id("bu1")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("t0901_login_field")).sendKeys("9840372968");
		//driver.findElement(By.xpath("//div[contains(text(),'Get customised quotes from seller')]/following::input[2]")).sendKeys("9840372968");
		driver.findElement(By.id("t0901_submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("t0901_q_email_in1")).sendKeys("mukkar72@gmail.com");
		

	}

}
