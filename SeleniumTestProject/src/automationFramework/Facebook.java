package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("mukkar10@outlook.com");
        driver.findElement(By.id("pass")).sendKeys("Mukunth@05");
        driver.findElement(By.id("u_0_b")).click();
	}

}
