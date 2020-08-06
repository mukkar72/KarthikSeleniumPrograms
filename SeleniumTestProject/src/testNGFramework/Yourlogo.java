package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yourlogo {

	public static void main(String[] args) throws InterruptedException {
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//click Sign In
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("july18karthik@yopmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		//Personal Info
		WebElement gender = driver.findElement(By.id("uniform-id_gender1"));
		gender.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Karthik");
		driver.findElement(By.id("customer_lastname")).sendKeys("raja");
		driver.findElement(By.id("passwd")).sendKeys("Mukunth@05");
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByVisibleText("7  ");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("June ");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("1972  ");
		driver.findElement(By.id("newsletter")).click();
		//Address Info
		driver.findElement(By.id("firstname")).sendKeys("Karthi");
		driver.findElement(By.id("lastname")).sendKeys("Raja");
		driver.findElement(By.id("address1")).sendKeys("NEw 30 old 22a arun street");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("New York");
		driver.findElement(By.id("postcode")).sendKeys("60002");
		driver.findElement(By.id("phone_mobile")).sendKeys("9840372968");
		WebElement finish = driver.findElement(By.id("submitAccount"));
		finish.click();
		

	}

}
