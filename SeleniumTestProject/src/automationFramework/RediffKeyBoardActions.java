package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RediffKeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Mukunth");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"muku1007").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.TAB,"Gurua@2020").build().perform();
		act.sendKeys(Keys.TAB,"Gurua@2020").build().perform();
		act.sendKeys(Keys.TAB,"july12karthik@yopmail.com").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB,"9840372969").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		Actions down = new Actions(driver);
		for (int day =0;day<10;day++) {
			down.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		act.sendKeys(Keys.TAB).build().perform();
		for (int month=0;month<7;month++) {
			down.sendKeys(Keys.ARROW_DOWN).build().perform();
					}
		act.sendKeys(Keys.TAB).build().perform();
		for (int year=0;year<16;year++) {
			down.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		for (int city=0;city<15;city++) {
			down.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(15000);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
	}

}
