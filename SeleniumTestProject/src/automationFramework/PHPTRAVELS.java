package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTRAVELS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//small[contains(text(),'http://www.phptravels.net')])[1]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click(); not working

	}

}
