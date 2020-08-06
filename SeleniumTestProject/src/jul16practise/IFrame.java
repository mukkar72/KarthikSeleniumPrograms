package jul16practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.id("name")).sendKeys("Karthikeyan");
		

	}

}
