package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBootStrap {

	public static void main(String[] args) {
		//browser opening
				System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
				driver.manage().window().maximize();
				
				//click the dropdown
				
				driver.findElement(By.id("bootstrapmenu")).click();
				ArrayList<WebElement> dd = new ArrayList<WebElement> (driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a")));
				for(WebElement values:dd) {
					String ddv = values.getText();
					System.out.println(ddv);
					if(ddv.equalsIgnoreCase("DEMO WEBSITES")) {
						values.click();
						break;
					}
				}

	}

}
