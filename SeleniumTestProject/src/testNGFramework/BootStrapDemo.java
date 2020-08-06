package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDemo {

	public static void main(String[] args) throws InterruptedException {
		//browser opening
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=37.0_1");
		driver.manage().window().maximize();
		
		// click the products button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Products ']")).click();
		Thread.sleep(5000);
		ArrayList<WebElement> product = new ArrayList<WebElement> (driver.findElements(By.xpath("//div[@class='btn-group']//ul/li")));
		for(WebElement PN:product) {
			String productvalues = PN.getText();
			System.out.println(productvalues);
			if(productvalues.equalsIgnoreCase("HTML") ) {
				PN.click();
				break;
			}
		}

	}

}
