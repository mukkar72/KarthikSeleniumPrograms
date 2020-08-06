package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("Mukunth");
		driver.findElement(By.id("u_0_o")).sendKeys("Karthikeyan");
		driver.findElement(By.id("u_0_r")).sendKeys("mukkar10@outlook.com");
		driver.findElement(By.id("u_0_u")).sendKeys("mukkar10@outlook.com");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("10");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jul");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2010");
		driver.findElement(By.id("password_step_input")).sendKeys("Mukunth@05");
		WebElement sex = driver.findElement(By.id("u_0_7"));
		sex.click();
		WebElement Submit = driver.findElement(By.id("u_0_12"));
		Submit.click();
		
		

	}

}
