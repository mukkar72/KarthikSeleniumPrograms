package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractise4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Contact us')])[1]")).click();
		Select heading = new Select(driver.findElement(By.id("id_contact")));
		heading.selectByVisibleText("Webmaster");
		driver.findElement(By.id("email")).sendKeys("mukkar72@gmail.com");
		driver.findElement(By.id("id_order")).sendKeys("A123456");
		driver.findElement(By.id("message")).sendKeys("What is the Status?");
		driver.findElement(By.id("submitMessage")).click();
		driver.findElement(By.xpath("(//a[@Class='btn btn-default button button-small'])[2]")).click();

	}

}
