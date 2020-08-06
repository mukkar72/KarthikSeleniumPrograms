package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractise3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		String result = driver.findElement(By.xpath("//span[@class='heading-counter']")).getText();
		System.out.println("Search Result :"+result);
		driver.findElement(By.xpath("//i[@class='icon-th-list']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[2]")).click();
		//driver.findElement(By.xpath("//span[@class='cross']")).click(); - how to resolve
		driver.close();
				

	}

}
