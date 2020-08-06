package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPoPUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]"));
		click.click();
		Thread.sleep(2000);
		Alert aler = driver.switchTo().alert();
		String text = aler.getText();
		System.out.println("text in the alert"+text);
		aler.accept();
		
		
	}

}
