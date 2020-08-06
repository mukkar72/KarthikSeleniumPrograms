package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolsQA {
		
		WebDriver driver;
		@Test (priority = 1)
		public void browserinitiation() {
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		}
		@Test (priority = 2)
		public void ClickDemo() throws InterruptedException {
		//click on demo site and select forms
		driver.findElement(By.xpath("(//span[contains(text(),'Demo Site')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]")).click();
		WebElement pf = driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]"));
		pf.click();
		}
		@Test (priority = 3)
		public void Registration() throws InterruptedException {
		//Student Registration Form
		Thread.sleep(4000);
		driver.findElement(By.id("firstName")).sendKeys("Mukunth");
		driver.findElement(By.id("lastName")).sendKeys("Karthik");
		driver.findElement(By.id("userEmail")).sendKeys("mukunth@yopmail.com");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		gender.click();
		driver.findElement(By.id("userNumber")).sendKeys("5555566666");
		Actions act1 = new Actions(driver);
		//act1.sendKeys(Keys.TAB).build().perform();
		act1.sendKeys(Keys.TAB,"Selenium").build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.id("subjectsContainer")).sendKeys("Selenium");
		driver.findElement(By.xpath("//label[contains(text(),'Hobbies')]/following::div[2]")).click();
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C://Users//DELL//Pictures//Saved Pictures//New Bitmap Image.bmp");
		driver.findElement(By.id("currentAddress")).sendKeys("New 30 Old 22A Aziz Nagar First STreet Kodambakkam");
		WebElement state = driver.findElement(By.id("state"));
		Thread.sleep(3000);
		state.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		WebElement city = driver.findElement(By.id("city"));
		Thread.sleep(2000);
		city.click();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeLargeModal")).click();
		}
		
		
		
		
		
		
		

	}


