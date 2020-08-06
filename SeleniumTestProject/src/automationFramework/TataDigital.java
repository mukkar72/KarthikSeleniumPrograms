package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TataDigital {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tata.com/tatadigital");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='nav-link contactUsBoxIcon hidden-sm hidden-xs']")).click();
		driver.findElement(By.xpath("(//img[@class='iconsMap1'])[4]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click(); not working
		//driver.findElement(By.xpath("//img[@id='icon4']")).click(); not working
		//driver.findElement(By.id("icon4")).click();not working

	}

}
