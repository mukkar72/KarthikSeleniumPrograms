package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsQAKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// browser opening
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//Registration
		driver.findElement(By.id("firstName")).sendKeys("Karthikeyan");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"Rajaram").build().perform();
		act.sendKeys(Keys.TAB,"kar@gmail.com").build().perform();
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		gender.click();
		act.sendKeys(Keys.TAB,"9840325698").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB,"Selenium").build().perform();
		driver.findElement(By.xpath("//label[contains(text(),'Hobbies')]/following::div[2]")).click();
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C://Users//DELL//Pictures//Saved Pictures//New Bitmap Image.bmp");
		driver.findElement(By.id("currentAddress")).sendKeys("New 30 Old 22A Aziz Nagar First STreet Kodambakkam");
		WebElement state = driver.findElement(By.id("state"));
		Thread.sleep(3000);
		state.click();
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN).build().perform();
		act1.sendKeys(Keys.ENTER).build().perform();
		WebElement city = driver.findElement(By.id("city"));
		Thread.sleep(2000);
		city.click();
		act1.sendKeys(Keys.ARROW_DOWN).build().perform();
		act1.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeLargeModal")).click();

	}

}
