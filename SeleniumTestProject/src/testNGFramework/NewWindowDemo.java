package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowDemo {
	WebDriver driver;
	@Test
	public void a_browseropening() {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_new_browser_window() {
		driver.findElement(By.id("button1")).click();
	}
	@Test
	public void c_moveto_newwindow() {
		ArrayList <String> nw = new ArrayList<String> (driver.getWindowHandles());
		for(String obj:nw) {
			System.out.println(obj);
			}
		driver.switchTo().window(nw.get(1));
		
	
		
	}
	
	}


