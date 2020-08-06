package testNGFramework;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartNewTab {
	WebDriver driver; 
	//Browser Initiation
	@Test
	public void a_browseropening() {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_closelogin()	{	
		//close the login window
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	@Test
	public void c_selectmen() {
		// select men
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(Men).build().perform();
	}
	@Test
	public void d_casualshirts() {
		//select casual shirts
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Casual Shirts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Men Printed Casual Shirt')]")).click();
	}
	@Test
	public void e_addtocart() {
		//  move to next tab
		ArrayList <String> tabs = new ArrayList <String> (driver.getWindowHandles());
		//for(String newtab:tabs) {
			//System.out.println(newtab);
		//}
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//a[text()='XXL']")).click();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	}
		
		
		
		

	}

	


