package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Karthikeyan");
		driver.findElement(By.name("lastname")).sendKeys("Rajaram");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-6")).click();
		driver.findElement(By.id("datepicker")).sendKeys("07JUN1972");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		Select cont = new Select(driver.findElement(By.id("continents")));
		cont.selectByVisibleText("Europe");
		WebElement ele = driver.findElement(By.id("selenium_commands"));
		Select commands = new Select(ele);
		commands.selectByVisibleText("Browser Commands");
		commands.selectByVisibleText("WebElement Commands");
		driver.findElement(By.id("submit")).click();
		
		

	}

}
