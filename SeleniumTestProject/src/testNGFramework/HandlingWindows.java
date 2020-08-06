package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWindows {
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	}
	@Test 
	public void b_handlingwindows() {
		ArrayList <String> Windows = new ArrayList <String> (driver.getWindowHandles());
		for(String obj:Windows) {
			System.out.println(obj);
		}
		driver.switchTo().window(Windows.get(1));
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
		driver.switchTo().window(Windows.get(2));
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();
	}
	

}
