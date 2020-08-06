package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lufthansa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lufthansa.com/in/en/homepage");
		driver.findElement(By.xpath("//input[@id='dcep-a277de671-30f0-439a-85fa-1a3ca6889abf-flm-flight-flightQuery.flightSegments[0].originCode']")).click();
		

	}

}
