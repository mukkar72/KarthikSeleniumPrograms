package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAForms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Mukunth");
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.TAB,"Rajaram").build().perform();
		Act.sendKeys(Keys.TAB,"july11karthik@yopmail.com").build().perform();
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		gender.click();
		Act.sendKeys(Keys.TAB,"9840372999").build().perform();
		Act.sendKeys(Keys.TAB).build().perform();
		Act.sendKeys(Keys.ENTER).build().perform();
		Act.sendKeys(Keys.TAB,"Selenium").build().perform();
		Thread.sleep(3000);
		WebElement State = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		State.click();
		 
		
		
		

	}

}
