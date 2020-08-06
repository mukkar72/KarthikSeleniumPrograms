package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoDaddy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Essential Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.godaddy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The Page Title is   :" +title);
		String pageurl = driver.getCurrentUrl();
		System.out.println("The Page URL is   :" +pageurl);
		
		
		

	}

}
