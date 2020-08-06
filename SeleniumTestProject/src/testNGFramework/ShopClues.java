package testNGFramework;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShopClues {
		WebDriver driver;
		@Test
		public void a_browseropen() {
		//browser opening
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
		}
		@Test
		public void b_close_popup() {
		//click allow popup
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Allow']")).click();
		}
		@Test 
		public void c_dailyessentials() {
		//click daily essentials
		WebElement daily = driver.findElement(By.xpath("//a[contains(text(),'Daily Essentials')]"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(daily).build().perform();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		@Test
		public void d_selectproduct() {
		//Click oils and Vinegars
		driver.findElement(By.xpath("//a[contains(text(),'Oils & Vinegars')]")).click();
		}
		@Test
		public void e_subproduct() {
		//select olive oil in the new tab
		ArrayList <String> Tabs = new ArrayList<String> (driver.getWindowHandles());
		for(String obj:Tabs) {
			System.out.println(obj);
		}
		driver.switchTo().window(Tabs.get(1));
		String title1 = driver.getTitle();
		System.out.println(title1);
		}
		@Test
		public void f_clickoil() {
		
		//click oil and move to next tab
		driver.findElement(By.xpath("//span[contains(text(),'Ondoliva Pomace')]")).click();
		ArrayList <String> Tabs1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(Tabs1.get(2));
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		}
		@Test 
		public void g_addtocart() {
		//click Add to cart in the new tab
		ArrayList <String> Tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(Tabs2.get(2));
		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.findElement(By.id("add_cart")).click();
		}
		
			}


