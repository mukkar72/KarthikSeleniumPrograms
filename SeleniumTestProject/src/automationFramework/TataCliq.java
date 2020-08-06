package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TataCliq {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/?cid=ps:TataCliq_Brand_Desktop_Exact:Google:Brand_TataCliq_Exact&gclid=CjwKCAjwxev3BRBBEiwAiB_PWCSsgcGcaxUC8U1VtvZ-toZ74hyFfh4-t8SgfM7YQ7ArYeCS-OHrgBoC810QAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("(//div[@class='_1kqv2p0bScjWTMozNVOVz5'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='_3lO6dQO9Ci8Lgb5-gV57jn'])[3]")).sendKeys("mukkar10@outlook.com");
		driver.findElement(By.xpath("(//input[@class='_3lO6dQO9Ci8Lgb5-gV57jn'])[4]")).sendKeys("Mukunth@05");
		WebElement sign = driver.findElement(By.xpath("(//div[@class='_3ohVlBQVxzL7rqc66lghTo'])[3]"));
		sign.click();

	}

}
