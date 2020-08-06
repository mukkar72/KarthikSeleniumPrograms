package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapHRM {
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver","D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_login() {
			driver.findElement(By.id("btnLogin")).click();
	}
	@Test
	public void c_addemployee() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'PIM')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(30000);
		driver.findElement(By.id("firstName")).sendKeys("Say");
		driver.findElement(By.id("lastName")).sendKeys("Ram");
		driver.findElement(By.xpath("//div[@id='location_inputfileddiv']")).click();
		//country dropdown
		ArrayList<WebElement> Country = new ArrayList<WebElement>(
		driver.findElements(By.xpath("//div[@id='location_inputfileddiv']//ul/li")));
		for(WebElement countryoptions:Country) {
			String dropdownvalues = countryoptions.getText();
			if(dropdownvalues.equalsIgnoreCase("     German Regional HQ")) {
				countryoptions.click();
				break;
			}
		}
		
	}

}
