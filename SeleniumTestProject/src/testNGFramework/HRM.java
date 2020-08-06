package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRM {
		WebDriver driver;
		@Test
		public void a_browseropening() {
	
		//browser opening
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btnLogin")).click();
		}
		@Test
		public void b_addemployee() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(text(),'PIM')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("menu_pim_addEmployee")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("John");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("cool");
			driver.findElement(By.id("location_inputfileddiv")).click();
			ArrayList<WebElement> location = new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@id='location_inputfileddiv']//ul/li")));
			for(WebElement locationlist:location) {
				String locationvalues = locationlist.getText();
				if(locationvalues.equalsIgnoreCase("     German Regional HQ")) {
					locationlist.click();
					break;
				}
			}
		}
		

	}


