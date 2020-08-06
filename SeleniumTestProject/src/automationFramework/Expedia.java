package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {

	public static void main(String[] args) throws InterruptedException {
		//pageload
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/?pwaLob=wizard-flight-pwa");
		driver.manage().window().maximize();
		//enter leaving from
		Thread.sleep(5000);
		driver.findElement(By.id("location-field-leg1-origin-input")).click();
		

	}

}
