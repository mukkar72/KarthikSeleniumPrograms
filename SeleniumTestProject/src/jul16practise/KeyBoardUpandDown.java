package jul16practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardUpandDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='Number']/following::input")).sendKeys("10");
		Actions up = new Actions(driver);
		for (int i=0;i<5;i++) {
			up.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(1000);
		}
		
		for(int i=0;i<10;i++) {
			up.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(1000);
		}
		

	}

}
