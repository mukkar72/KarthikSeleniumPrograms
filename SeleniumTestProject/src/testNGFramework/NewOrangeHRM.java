package testNGFramework;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewOrangeHRM {

	WebDriver driver;
	@Test 
	public void a_BrowserOpening() throws IOException {
	//browser opening
	System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("btnLogin")).click();
		}
	@Test
	public void b_Addemployee() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'PIM')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("cool");
		Thread.sleep(5000);
		driver.findElement(By.id("location_inputfileddiv")).click();
		ArrayList <WebElement> location = new ArrayList <WebElement>(driver.findElements(By.xpath("//div[@id='location_inputfileddiv']//ul/li")));
		for(WebElement locationlist:location) {
			String locationvalues = locationlist.getText();
			if (locationvalues.equalsIgnoreCase("     German Regional HQ")) {
			locationlist.click();
			break;
			}
					}
		Thread.sleep(5000);
		driver.findElement(By.id("systemUserSaveBtn")).click();
	}
	@Test
	public void c_personalinfo() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("//label[text()='Marital Status']/preceding::i[1]")).click();
		driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--year'])[1]")).click();
		ArrayList<WebElement> year = new ArrayList<WebElement>(driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--year'])[1]//ul/li")));
		for(WebElement yearlist:year) {
			String yearvalues = yearlist.getText();
			if(yearvalues.equalsIgnoreCase("1972")) {
				Thread.sleep(3000);
				yearlist.click();
				break;
			}
		}
		
	}
	
}


