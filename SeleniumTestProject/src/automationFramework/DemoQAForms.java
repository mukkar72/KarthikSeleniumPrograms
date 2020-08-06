package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoQAForms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
		driver.findElement(By.id("firstName")).sendKeys("Karthikeyan");
		driver.findElement(By.id("lastName")).sendKeys("Rajaram");
		driver.findElement(By.id("userEmail")).sendKeys("mukkar72@gmail.com");
		//driver.findElement(By.xpath("//div[contains(text(),'Gender')]/following::div[2]")).click();
		//driver.findElement(By.id("gender-radio-1")).click();
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		gender.click();
		driver.findElement(By.id("userNumber")).sendKeys("9840372968");
		Thread.sleep(5000);
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("07 Jun 1972");how to clear the value in the date of birth and select a new value
		driver.findElement(By.xpath("//label[contains(text(),'Hobbies')]/following::div[2]")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("New 30 Old 22A Aziz Nagar First STreet Kodambakkam");
		Thread.sleep(3000);
		WebElement State = driver.findElement(By.id("state"));
		State.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	
		
 
	}

}
