package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractiseForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Karthikeyan");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"Rajaram").build().perform();
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-6")).click();
		driver.findElement(By.id("datepicker")).sendKeys("14 July 2020");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		driver.findElement(By.id("continents")).click();
		//Actions cont = new Actions(driver);
		for(int conty=0;conty<3;conty++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
		}
		Select commands = new Select(driver.findElement(By.id("selenium_commands")));
		commands.selectByVisibleText("Navigation Commands");
		commands.selectByVisibleText("WebElement Commands");
		
		
		
		

	}

}
